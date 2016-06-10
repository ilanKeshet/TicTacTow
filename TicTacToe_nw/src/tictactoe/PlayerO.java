package tictactoe;

public class PlayerO {

	private boolean nowPlays;

	public boolean isNowPlays() {
		return this.nowPlays;
	}

	public void setNowPlays(boolean nowPlays) {
		this.nowPlays = nowPlays;
	}
	
	public PlayerO(){
		
		super();
		this.setNowPlays(false);
	}
	
	public void myTurn(){
		
		this.setNowPlays(true);
	}
}
