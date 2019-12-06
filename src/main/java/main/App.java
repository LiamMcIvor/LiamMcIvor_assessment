package main;

public class App {
	
	public static void main(String[] args) {
		GameLoop gl = new GameLoop();
//		gl.setSize();
		gl.initializeObjects();
		gl.loop();
	}
	
}
