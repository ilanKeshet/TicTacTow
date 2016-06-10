package gui.menu;

import javax.swing.JMenuItem;

public class ExitMenuItem extends JMenuItem {

	public ExitMenuItem(){
		
		super("Exit");
		ExitListener el = new ExitListener();
		super.addActionListener(el);
	}
}
