package gui.menu;

import javax.swing.JMenuBar;

public class MainMenuBar extends JMenuBar {
	
	public MainMenuBar(){
		
		super();
		GameMenu gm = new GameMenu();
	
		super.add(gm);
	}

}
