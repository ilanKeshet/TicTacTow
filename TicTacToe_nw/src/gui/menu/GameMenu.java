package gui.menu;

import javax.swing.JMenu;

public class GameMenu extends JMenu {

	public GameMenu(){
		
		super("Game");
		ExitMenuItem exitItem = new ExitMenuItem();
		RestartMenuItem restart = new RestartMenuItem();
		super.add(exitItem);	
		super.add(restart);
		super.setVisible(true);
	}
}
