package gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import tictactoe.PlayerO;
import tictactoe.PlayerX;

public class GameFieldPanel extends JPanel {

	// getters and seetters for the Buttons
	public Button getButton1(){
		return (Button)this.getComponent(0);
	}
	public Button getButton2(){
		return (Button)this.getComponent(1);
	}
	public Button getButton3(){
		return (Button)this.getComponent(2);
	}
	public Button getButton4(){
		return (Button)this.getComponent(3);
	}
	public Button getButton5(){
		return (Button)this.getComponent(4);
	}
	public Button getButton6(){
		return (Button)this.getComponent(5);
	}
	public Button getButton7(){
		return (Button)this.getComponent(6);
	}
	public Button getButton8(){
		return (Button)this.getComponent(7);
	}
	public Button getButton9(){
		return (Button)this.getComponent(8);
	}
	
	// constructor for the main game panel
	public GameFieldPanel(PlayerX playerX, PlayerO playerO){
	
		super();
		// creates a layout of 3x3 
		GridLayout layout = new GridLayout(3, 3, 5, 5);

		// creats buttons
		Button button1 = new Button(playerX, playerO);
		Button button2 = new Button(playerX, playerO);
		Button button3 = new Button(playerX, playerO);
		Button button4 = new Button(playerX, playerO);
		Button button5 = new Button(playerX, playerO);
		Button button6 = new Button(playerX, playerO);
		Button button7 = new Button(playerX, playerO);
		Button button8 = new Button(playerX, playerO);
		Button button9 = new Button(playerX, playerO);
		button1.setActionCommand("button1");
		button2.setActionCommand("button2");
		button3.setActionCommand("button3");
		button4.setActionCommand("button4");
		button5.setActionCommand("button5");
		button6.setActionCommand("button6");
		button7.setActionCommand("button7");
		button8.setActionCommand("button8");
		button9.setActionCommand("button9");
		
		// setting the 3x3 layout as the layout for the display panel
		super.setLayout(layout);
		// adding the buttons to the panel
		super.add(button1);
		super.add(button2);
		super.add(button3);
		super.add(button4);
		super.add(button5);
		super.add(button6);
		super.add(button7);
		super.add(button8);
		super.add(button9);
		
		super.setVisible(true);

	}
}
