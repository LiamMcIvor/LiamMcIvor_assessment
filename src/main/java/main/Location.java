package main;

public class Location {

	public int xLocation;
	public int yLocation;
	
	public Location() {
		
	}
	
	public void setInitialLocation(int x, int y) {
		double doubleX =  Math.random()*x;
		xLocation = (int) doubleX;
		double doubleY =  Math.random()*y;
		yLocation = (int) doubleY;
	}
	
//	public void setInitialLocation() {
//		double doubleX =  Math.random()*10;
//		xLocation = (int) doubleX;
//		double doubleY =  Math.random()*10;
//		yLocation = (int) doubleY;
//	}
	
	public int getXLocation() {
		return xLocation;
	}
	
	public int getYLocation() {
		return yLocation;
	}
	
}