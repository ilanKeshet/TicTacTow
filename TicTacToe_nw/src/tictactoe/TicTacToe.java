package tictactoe;

import gui.Mainframe;
import tictactoe.startmenuframe.MenuDialog;

public class TicTacToe {

	public static void main(String[] args) {
		
		// creates two players
		PlayerX playerX = new PlayerX();
		PlayerO playerO = new PlayerO();
		
		// invokes the Mainframe method		
		Mainframe mf = new Mainframe(playerX, playerO);
		
		// invokes the JDialog menu at the start of the game
		MenuDialog menuDialog = new MenuDialog(mf);

	}

}
