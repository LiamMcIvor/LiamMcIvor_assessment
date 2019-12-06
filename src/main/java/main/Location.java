package main;

public class Location {

	public int xLocation;
	public int yLocation;
	
	public Location() {
		
	}
	
	public void setInitialLocation() {
		double doubleX =  Math.random()*5;
		xLocation = (int) doubleX;
		double doubleY =  Math.random()*5;
		yLocation = (int) doubleY;
	}
	
	public int getXLocation() {
		return xLocation;
	}
	
	public int getYLocation() {
		return yLocation;
	}
	
}