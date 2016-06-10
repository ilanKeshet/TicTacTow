package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import tictactoe.PlayerO;
import tictactoe.PlayerX;

public class ButtonListener implements ActionListener {

	private PlayerX playerX;
	private PlayerO playerO;
	
	
	public PlayerO getPlayerO() {
		return this.playerO;
	}
	public void setPlayerO(PlayerO playerO) {
		this.playerO = playerO;
	}
	public PlayerX getPlayerX() {
		return this.playerX;
	}
	public void setPlayerX(PlayerX playerX) {
		this.playerX = playerX;
	}
	
	public ButtonListener(PlayerX playerX, PlayerO playerO) {

		super();
		this.setPlayerX(playerX);
		this.setPlayerO(playerO);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		char aktuellesZeichen = 'o';
		if(playerX.isNowPlays()){
			aktuellesZeichen = 'x';
		}
			
		((Button)e.getSource()).setText("    " + String.valueOf(aktuellesZeichen).toUpperCase() + "    ");
		((Button)e.getSource()).setxOrO(aktuellesZeichen);
			
	
			switch (((Button)e.getSource()).getActionCommand()){
				case "button1": {
					System.out.println("works");
					if((((Button)((Button)e.getSource()).getParent().getComponent(1)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(2)).getxOrO()==aktuellesZeichen) ||
							(((Button)((Button)e.getSource()).getParent().getComponent(4)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(8)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(3)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(6)).getxOrO()==aktuellesZeichen)){
						System.out.println("Player " + aktuellesZeichen + " wins");
						((Button)((Button)e.getSource()).getParent().getComponent(0)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(1)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(2)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(3)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(4)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(5)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(6)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(7)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(8)).setEnabled(false);
					}

					break;
				}
				case "button2":{
					if((((Button)((Button)e.getSource()).getParent().getComponent(4)).getxOrO()== aktuellesZeichen && 
					((Button)((Button)e.getSource()).getParent().getComponent(7)).getxOrO()==aktuellesZeichen) ||
							(((Button)((Button)e.getSource()).getParent().getComponent(0)).getxOrO()==aktuellesZeichen &&
							((Button)((Button)e.getSource()).getParent().getComponent(2)).getxOrO()==aktuellesZeichen)){
						System.out.println("Player " + aktuellesZeichen + " wins");
						((Button)((Button)e.getSource()).getParent().getComponent(0)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(1)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(2)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(3)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(4)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(5)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(6)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(7)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(8)).setEnabled(false);
					}

					break;
				}
				case "button3":{
					if((((Button)((Button)e.getSource()).getParent().getComponent(1)).getxOrO()==aktuellesZeichen && 
					((Button)((Button)e.getSource()).getParent().getComponent(0)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(5)).getxOrO()==aktuellesZeichen &&
							((Button)((Button)e.getSource()).getParent().getComponent(8)).getxOrO()==aktuellesZeichen) ||
							(((Button)((Button)e.getSource()).getParent().getComponent(4)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(6)).getxOrO()=='x')){
						System.out.println("Player " + aktuellesZeichen + " wins");
						((Button)((Button)e.getSource()).getParent().getComponent(0)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(1)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(2)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(3)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(4)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(5)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(6)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(7)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(8)).setEnabled(false);
					}

					break;
				}
				case "button4":
					if((((Button)((Button)e.getSource()).getParent().getComponent(0)).getxOrO()==aktuellesZeichen && 
					((Button)((Button)e.getSource()).getParent().getComponent(6)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(4)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(5)).getxOrO()==aktuellesZeichen)){
						
						System.out.println("Player " + aktuellesZeichen + " wins");
						((Button)((Button)e.getSource()).getParent().getComponent(0)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(1)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(2)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(3)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(4)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(5)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(6)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(7)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(8)).setEnabled(false);
					}

					break;
				case "button5":
					if((((Button)((Button)e.getSource()).getParent().getComponent(3)).getxOrO()==aktuellesZeichen && 
					((Button)((Button)e.getSource()).getParent().getComponent(5)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(0)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(8)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(1)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(7)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(2)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(6)).getxOrO()==aktuellesZeichen)){
						System.out.println("Player " + aktuellesZeichen + " wins");
						((Button)((Button)e.getSource()).getParent().getComponent(0)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(1)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(2)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(3)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(4)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(5)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(6)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(7)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(8)).setEnabled(false);
					}

					break;
				case "button6":
					if((((Button)((Button)e.getSource()).getParent().getComponent(3)).getxOrO()==aktuellesZeichen && 
					((Button)((Button)e.getSource()).getParent().getComponent(4)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(2)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(8)).getxOrO()==aktuellesZeichen)){
						System.out.println("Player " + aktuellesZeichen + " wins");
						((Button)((Button)e.getSource()).getParent().getComponent(0)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(1)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(2)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(3)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(4)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(5)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(6)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(7)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(8)).setEnabled(false);
					}

					break;
				case "button7":
					if((((Button)((Button)e.getSource()).getParent().getComponent(3)).getxOrO()==aktuellesZeichen && 
					((Button)((Button)e.getSource()).getParent().getComponent(0)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(7)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(8)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(4)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(2)).getxOrO()==aktuellesZeichen)){
						System.out.println("Player " + aktuellesZeichen + " wins");
						((Button)((Button)e.getSource()).getParent().getComponent(0)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(1)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(2)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(3)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(4)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(5)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(6)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(7)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(8)).setEnabled(false);
					}

					break;
				case "button8":
					if((((Button)((Button)e.getSource()).getParent().getComponent(6)).getxOrO()==aktuellesZeichen && 
					((Button)((Button)e.getSource()).getParent().getComponent(8)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(4)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(1)).getxOrO()==aktuellesZeichen)){
						System.out.println("Player " + aktuellesZeichen + " wins");
						((Button)((Button)e.getSource()).getParent().getComponent(0)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(1)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(2)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(3)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(4)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(5)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(6)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(7)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(8)).setEnabled(false);
					}

					break;
				case "button9":
					if((((Button)((Button)e.getSource()).getParent().getComponent(6)).getxOrO()==aktuellesZeichen && 
					((Button)((Button)e.getSource()).getParent().getComponent(7)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(4)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(0)).getxOrO()==aktuellesZeichen) || 
							(((Button)((Button)e.getSource()).getParent().getComponent(5)).getxOrO()==aktuellesZeichen && 
							((Button)((Button)e.getSource()).getParent().getComponent(2)).getxOrO()==aktuellesZeichen)){
						System.out.println("Player " + aktuellesZeichen + " wins");
						((Button)((Button)e.getSource()).getParent().getComponent(0)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(1)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(2)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(3)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(4)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(5)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(6)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(7)).setEnabled(false);
						((Button)((Button)e.getSource()).getParent().getComponent(8)).setEnabled(false);
					}

					break;
					
				default: {
//					System.out.println("no");
					break;
				}
			}
			
			((Button)e.getSource()).setEnabled(false);
			playerO.setNowPlays(!playerO.isNowPlays());
			playerX.setNowPlays(!playerX.isNowPlays());			
		}
	}

