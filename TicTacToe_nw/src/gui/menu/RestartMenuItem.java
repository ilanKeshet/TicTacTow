package gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class RestartMenuItem extends JMenuItem {

	public RestartMenuItem(){
		
		super("Restart Game");
		super.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(
						((JPopupMenu)((RestartMenuItem)e.getSource()).getParent()).getRootPane().toString());
				
			}
		});
	}
}
