package tictactoe.startmenuframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		((MenuDialog)(((StartButton)e.getSource()).getParent().getParent().getParent().getParent())).dispose();
	}

}
