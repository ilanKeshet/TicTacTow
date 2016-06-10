package tictactoe;

public class PlayerX {

	private boolean nowPlays;
	
	
	public boolean isNowPlays() {
		return this.nowPlays;
	}


	public void setNowPlays(boolean nowPlays) {
		this.nowPlays = nowPlays;
	}


	public PlayerX(){
		
		super();
		this.setNowPlays(true);
	}
	
	public void myTurn(){
		
		this.setNowPlays(true);
	}
}
