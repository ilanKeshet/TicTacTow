package tictactoe.startmenuframe;

import javax.swing.JButton;

import gui.menu.ExitListener;

public class ExitButton extends JButton {

	public ExitButton(){
		
		super();
		super.setText("Exit Game");
		ExitListener el = new ExitListener();
		super.addActionListener(el);
		
	}
}
