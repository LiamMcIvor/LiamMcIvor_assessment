package main;

public class Item {
	private int itemX;
	private int itemY;
	
	public void setItemLocation() {
		double doubleX =  Math.random()*5;
		itemX = (int) doubleX;
		double doubleY =  Math.random()*5;
		itemY = (int) doubleY;
	}
	
	public int getItemXLocation() {
		return itemX;
	}
	
	public int getItemYLocation() {
		return itemY;
	}
	
}
