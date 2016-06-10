package tictactoe.startmenuframe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

import gui.Mainframe;

public class MenuDialog extends JDialog {
	
	private Mainframe mf;
	
	public Mainframe getMf() {
		return this.mf;
	}

	public void setMf(Mainframe mf) {
		this.mf = mf;
	}

	public MenuDialog(Mainframe mf){
		
		super();
		super.setUndecorated(true);
		super.setSize(300, 200);
		super.setLocationRelativeTo(mf);
		super.setModal(true);
		super.setResizable(false);
		super.getContentPane().setLayout(new GridLayout(2,0));
		StartButton st = new StartButton();
		ExitButton eb = new ExitButton();
		super.getContentPane().add(st);
		super.getContentPane().add(eb);		
		super.setVisible(true);
	}

}
