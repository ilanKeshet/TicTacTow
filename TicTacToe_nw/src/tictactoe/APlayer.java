package tictactoe;

public class APlayer {

	private boolean nowPlays;

	public boolean isNowPlays() {
		return this.nowPlays;
	}

	public void setNowPlays(boolean nowPlays) {
		this.nowPlays = nowPlays;
	}

	protected APlayer(boolean isMyTurn){
		this.setNowPlays(isMyTurn);
	}

	public void myTurn(){

		this.setNowPlays(true);
	}
}
