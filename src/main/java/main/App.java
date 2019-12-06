package main;

public class App {
	
	public static void main(String[] args) {
	
//		Location local = new Location();
//		local.setItemLocation();
//		
//		System.out.println(local.getItemXLocation());
//		System.out.println(local.getItemYLocation());
//		Player player = new Player();
//		player.setInitialPlayerLocation();
//
//		System.out.println(player.getPlayerXLocation());
//		System.out.println(player.getPlayerYLocation());
////		player.move("N");
////		player.move("E");
//		
//		Compass comp = new Compass();
//		System.out.println(comp.distanceToItem(player.getPlayerXLocation(), player.getPlayerYLocation(), 
//				local.getItemXLocation(), local.getItemYLocation()));
//		player.move("N");
//		System.out.println(comp.distanceToItem(player.getPlayerXLocation(), player.getPlayerYLocation(), 
//				local.getItemXLocation(), local.getItemYLocation()));
		GameLoop gl = new GameLoop();
		gl.initializeObjects();
		gl.loop();
	}
	
}
