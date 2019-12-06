package main;

public class Compass {

	private int xDifference;
	private int yDifference;
	private double distance;
	
	public double distanceToItem(int playerX, int playerY, int itemX, int itemY) {
		xDifference = itemX - playerX;
		yDifference = itemY - playerY;
		distance = Math.hypot(xDifference, yDifference);
		return distance;
	}
}
