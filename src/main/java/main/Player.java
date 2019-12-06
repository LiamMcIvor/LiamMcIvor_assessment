package main;

public class Player {

	private String direction;
	private int playerX;
	public int playerY;
	
	public int getPlayerXLocation() {
		return playerX;
	}
	
	public int getPlayerYLocation() {
		return playerY;
	}
	
	public void setInitialPlayerLocation() {
		double doubleX =  Math.random()*5;
		playerX = (int) doubleX;
		double doubleY =  Math.random()*5;
		playerY = (int) doubleY;
	}
	
	public void setPlayerXLocation(int xLocation) {
		this.playerX = xLocation;
	}
	
	public void setPlayerYLocation(int yLocation) {
		this.playerY = yLocation;
	}
	
	public void move(String direction) {

		switch(direction) {
		case "N":
			playerY++;
			break;
		case "E":
			playerX++;
			break;
		case "S":
			playerY--;
			break;
		case "W":
			playerX--;
			break;
		default:
			break;
		}
		
	}
}
