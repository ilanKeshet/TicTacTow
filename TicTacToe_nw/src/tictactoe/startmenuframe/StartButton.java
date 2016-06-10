package tictactoe.startmenuframe;

import javax.swing.JButton;

public class StartButton extends JButton {

	public StartButton(){
		
		super();
		super.setText("Start Game");
		StartListener sl = new StartListener();
		super.addActionListener(sl);
		
	}
}
