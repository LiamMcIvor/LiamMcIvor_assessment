package main;

public class Location {

	private int itemX;
	private int itemY;
	private int playerX;
	private int playerY;
	
//	public Location(int localX, int localY){
//		this.x = localX;
//		this.y = localY;
//	}
	
	public Location() {
		
	}
	
	public void setItemLocation() {
		double doubleX =  Math.random()*5;
		itemX = (int) doubleX;
		double doubleY =  Math.random()*5;
		itemY = (int) doubleY;
	}
	
	public void setPlayerLocation() {
		double doubleX =  Math.random()*5;
		playerX = (int) doubleX;
		double doubleY =  Math.random()*5;
		playerY = (int) doubleY;
	}
	
	public int getItemXLocation() {
		return itemX;
	}
	
	public int getItemYLocation() {
		return itemY;
	}
	
	public int getPlayerXLocation() {
		return playerX;
	}
	
	public int getPlayerYLocation() {
		return playerY;
	}
}
