package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import gui.menu.MainMenuBar;
import tictactoe.PlayerO;
import tictactoe.PlayerX;
// the main GUI frame
public class Mainframe extends JFrame {
	
	// a getter for the GameFieldPanel display
	public GameFieldPanel getGameFieldPanel(){
		return (GameFieldPanel)super.getContentPane().getComponent(0);
	}
	
	// constructor for the Mainframe
	public Mainframe(PlayerX playerX, PlayerO playerO){
		
		super();
		super.setTitle("Noam's Super Tic Tac Toe");
		super.setResizable(false);
		super.setSize(500, 520);
		
		//layout manager for the mainframe
	
		BorderLayout layout = new BorderLayout();
		super.getContentPane().setLayout(layout);
		
		// creates and adds the main menu bar and sets it in the Mainframe
		MainMenuBar mainMenuBar = new MainMenuBar();
		super.setJMenuBar(mainMenuBar);
		
		// invocation of the main Panel in the GUI Mainframe
		GameFieldPanel display = new GameFieldPanel(playerX, playerO);
		
		// set the display panel  in the content panel
		super.getContentPane().add(display, BorderLayout.CENTER);

		super.setVisible(true);
	}
}
