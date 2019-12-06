package main;

public class Player extends Location {
	
	public void move(String direction) {

		switch(direction) {
		case "N":
			this.yLocation++;
			break;
		case "E":
			this.xLocation++;
			break;
		case "S":
			this.yLocation--;
			break;
		case "W":
			this.xLocation--;
			break;
		default:
			break;
		}
		
	}
}
