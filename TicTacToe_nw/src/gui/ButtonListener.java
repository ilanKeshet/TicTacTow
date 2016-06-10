package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import tictactoe.PlayerO;
import tictactoe.PlayerX;

public class ButtonListener implements ActionListener {

	public static final int NUMBER_OF_BUTTONS = 9;
	private PlayerX playerX;
	private PlayerO playerO;


	public PlayerO getPlayerO() {
		return this.playerO;
	}
	public void setPlayerO(PlayerO playerO) {
		this.playerO = playerO;
	}
	public PlayerX getPlayerX() {
		return this.playerX;
	}
	public void setPlayerX(PlayerX playerX) {
		this.playerX = playerX;
	}

	public ButtonListener(PlayerX playerX, PlayerO playerO) {
		this.setPlayerX(playerX);
		this.setPlayerO(playerO);
	}


	/**
	 * <code><pre>
	 * {
	 *     0 = [ [0, 1, 2], [0, 3, 6], [0, 4, 8] ],
	 *     1 = [ [0, 1, 2], [1, 4, 7] ],
	 *     2 = [ [0, 1, 2], [2, 5, 8], [2, 4, 6] ],
	 *     3 = [ [3, 4, 5], [0, 3, 6] ],
	 *     4 = [ [3, 4, 5], [1, 4, 7], [0, 4, 8], [2, 4, 6] ],
	 *     5 = [ [3, 4, 5], [2, 5, 8] ],
	 *     6 = [ [6, 7, 8], [0, 3, 6], [2, 4, 6] ],
	 *     7 = [ [6, 7, 8], [1, 4, 7] ],
	 *     8 = [ [6, 7, 8], [2, 5, 8], [0, 4, 8] ]
	 * }
	 * </pre></code>
	 */
	public static final Map<Integer,Collection<Set<Integer>>> WINNING_MOVES = Collections.unmodifiableMap(new HashMap<Integer, Collection<Set<Integer>>>() {
		/** not serializing */
		private static final long serialVersionUID = 1L;

		{ // Initialization block
			// rows
			add(0, 1, 2);
			add(3, 4, 5);
			add(6, 7, 8);
			// columns
			add(0, 3, 6);
			add(1, 4, 7);
			add(2, 5, 8);
			// diagonals
			add(0, 4, 8);
			add(2, 4, 6);
			System.out.println(toString());
		}

		// this is where the body of this anonymous inner class extending map starts

		/**
		 * takes a list of integers representing button numbers and converts them to a map where each button
		 * points to a Set of Collection of all the Wining Streaks it participates in.
		 *
		 * @param winingStreak varargs
		 * @see example above
		 */
		private void add(Integer... winingStreak) {
			if(winingStreak == null || winingStreak.length != 3) {
				throw new IllegalArgumentException("a winning move length must be 3 buttons received '" + Arrays.toString(winingStreak)+ "'");
			}

			for (int i = 0; i < winingStreak.length; i++) {
				Integer buttonNum = winingStreak[i];
				Collection<Set<Integer>> winCollection = get(buttonNum);
				if(winCollection == null) {
					// the center button participates in 4 winning moves
					winCollection = new ArrayList<>(4);
					put(buttonNum, winCollection);
				}

				Set<Integer> immutableWiningMove = Collections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(winingStreak)));
				if (immutableWiningMove.size() != 3) {
					throw new IllegalArgumentException("a winning move may not contain duplicate buttons, received '" + Arrays.toString(winingStreak)+ "'");
				}

				if(!winCollection.contains(immutableWiningMove)){
					winCollection.add(immutableWiningMove);
				}
			}
		}

	});

	/*
	 * | 0 | 1 | 2 |
	 * | 3 | 4 | 5 |
	 * | 6 | 7 | 8 |
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		char aktuellesZeichen = playerX.isNowPlays() ? 'x' : 'o';

		Button source = (Button) e.getSource();
		source.setText("    " + String.valueOf(aktuellesZeichen).toUpperCase() + "    ");
		source.setxOrO(aktuellesZeichen);
		Container parent = source.getParent();


		Integer myNumber = whoAmI(parent, source);
		System.out.println("player " + aktuellesZeichen + " pressed button number " + myNumber);
		Iterable<Integer> winingMove = findWiningMoveIfExists(aktuellesZeichen, parent, myNumber);
		boolean isWin = (winingMove != null);

		if(isWin) {
			System.out.println("Player " + aktuellesZeichen + " wins with " + winingMove);
			dsiableAll(parent);
		} else {
			source.setEnabled(false);
			playerO.setNowPlays(!playerO.isNowPlays());
			playerX.setNowPlays(!playerX.isNowPlays());
		}

	}
	private Iterable<Integer> findWiningMoveIfExists(char aktuellesZeichen, Container parent, Integer myNumber) {
		Collection<Set<Integer>> potentialWins = WINNING_MOVES.get(myNumber);
		for (Set<Integer> potentialWin : potentialWins) {
			if(isItWiningMove(aktuellesZeichen, parent, potentialWin)) {
				System.out.println("winning move is " + potentialWin);
				return potentialWin;
			}
		}
		return null;
	}

	private Integer whoAmI(Container parent, Button me) {
		for (int i = 0 ; i < NUMBER_OF_BUTTONS ; i++) {
			Button button = (Button) parent.getComponent(i);
			if (me == button) {
				return i;
			}
		}
		throw new IllegalStateException("I Am nowhere to be found on parent='" + parent + "' how could it be? can you help idneitify me='" + me + "'");
	}

	private void dsiableAll(Container parent) {
		for (int i = 0 ; i < NUMBER_OF_BUTTONS ; i++) {
			Button button = (Button) parent.getComponent(i);
			button.setEnabled(false);
		}
	}

	private boolean isItWiningMove(char aktuellesZeichen, Container parent, Iterable<Integer> streak){
		for (Integer i : streak) {
			Button button = (Button) parent.getComponent(i);
			if(aktuellesZeichen != button.getxOrO()){
				return false; // no need to continue
			}
		}
		return true;
	}
}

