package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	/*
	 * | 0 | 1 | 2 |
	 * | 3 | 4 | 5 |
	 * | 6 | 7 | 8 |
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		char aktuellesZeichen = playerX.isNowPlays() ? 'x' : 'o';

		Button source = (Button)e.getSource();
		source.setText("    " + String.valueOf(aktuellesZeichen).toUpperCase() + "    ");
		source.setxOrO(aktuellesZeichen);

		Container parent = source.getParent();
		boolean isWin = false;
		String buttonActionCommand = source.getActionCommand();
		switch (buttonActionCommand){
			case "button1": {
				System.out.println("works");
				if( 	isItWiningMove(aktuellesZeichen, parent, 1, 2)
					||	isItWiningMove(aktuellesZeichen, parent, 4, 8)
					||	isItWiningMove(aktuellesZeichen, parent, 3, 6) ) {
					isWin = true;
				}
				break;
			}
			case "button2":{
				if(		isItWiningMove(aktuellesZeichen, parent, 4, 7)
					||	isItWiningMove(aktuellesZeichen, parent, 0, 2) ) {
					isWin = true;
				}
				break;
			}
			case "button3":{
				if( 	isItWiningMove(aktuellesZeichen, parent, 1, 0)
					||	isItWiningMove(aktuellesZeichen, parent, 5, 8)
					||	isItWiningMove(aktuellesZeichen, parent, 4, 6) ) {
					isWin = true;
				}
				break;
			}
			case "button4":
				if( 	isItWiningMove(aktuellesZeichen, parent, 6, 0)
					||	isItWiningMove(aktuellesZeichen, parent, 5, 4) ) {
					isWin = true;
				}
				break;
			case "button5":
				if( 	isItWiningMove(aktuellesZeichen, parent, 3, 5)
					||	isItWiningMove(aktuellesZeichen, parent, 0, 8)
					||	isItWiningMove(aktuellesZeichen, parent, 1, 7)
					||	isItWiningMove(aktuellesZeichen, parent, 2, 6) ) {
					isWin = true;
				}
				break;
			case "button6":
				if( 	isItWiningMove(aktuellesZeichen, parent, 4, 3)
					||	isItWiningMove(aktuellesZeichen, parent, 2, 8) ) {
					isWin = true;
				}
				break;
			case "button7":
				if( 	isItWiningMove(aktuellesZeichen, parent, 3, 0)
					||	isItWiningMove(aktuellesZeichen, parent, 7, 8)
					||	isItWiningMove(aktuellesZeichen, parent, 4, 2) ) {
					isWin = true;
				}
				break;
			case "button8":
				if( 	isItWiningMove(aktuellesZeichen, parent, 1, 4)
					||	isItWiningMove(aktuellesZeichen, parent, 8, 6) ) {
					isWin = true;
				}
				break;
			case "button9":
				if( 	isItWiningMove(aktuellesZeichen, parent, 4, 0)
					||	isItWiningMove(aktuellesZeichen, parent, 5, 2)
					||	isItWiningMove(aktuellesZeichen, parent, 7, 6) ) {
					isWin = true;
				}
				break;

			default: {
				throw new IllegalStateException("should never get here! unknown button '" + buttonActionCommand + "'");
			}
		}

		if(isWin) {
			System.out.println("Player " + aktuellesZeichen + " wins");
			dsiableAll(parent);
		} else {
			source.setEnabled(false);
			playerO.setNowPlays(!playerO.isNowPlays());
			playerX.setNowPlays(!playerX.isNowPlays());
		}

	}

	private void dsiableAll(Container parent) {
		for (int i = 0 ; i < NUMBER_OF_BUTTONS ; i++) {
			Button button = (Button)parent.getComponent(i);
			button.setEnabled(false);
		}
	}

	private boolean isItWiningMove(char aktuellesZeichen, Container parent, int neighbor1, int neighbor2){
		Button button1 = (Button)parent.getComponent(neighbor1);
		Button button2 = (Button)parent.getComponent(neighbor2);

		boolean result = aktuellesZeichen == button1.getxOrO() && aktuellesZeichen == button2.getxOrO();

		return result;
	}
}

