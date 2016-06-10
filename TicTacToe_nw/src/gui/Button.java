package gui;

import java.awt.Font;

import javax.swing.JButton;

import tictactoe.PlayerO;
import tictactoe.PlayerX;

public class Button extends JButton {
		
	// a char to represent which player is on
		private char xOrO;
		
	public char getxOrO() {
			return xOrO;
		}

		public void setxOrO(char xOrO) {
			this.xOrO = xOrO;
		}

		// constructor for the buttons
	public Button(PlayerX playerX, PlayerO playerO){
		
		super();
		super.setEnabled(true);
		super.setText("        ");
		this.setxOrO(' ');
		super.setFont(new Font("Arial", Font.PLAIN, 30));
		
		// creats and add a buttons listenenr to the button
		ButtonListener bl = new ButtonListener(playerX, playerO);
		super.addActionListener(bl);
		super.setVisible(true);
	}
}
