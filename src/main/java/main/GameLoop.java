package main;

import java.awt.Component;

import javax.swing.JOptionPane;

public class GameLoop {

	private boolean playing = true;
	Player player = new Player();
	Compass compass = new Compass();
	Item item = new Item();
	
	public void initializeObjects() {
		player.setInitialLocation();
		item.setInitialLocation();
		if(compass.distanceToItem(player.getXLocation(), player.getYLocation(), item.getXLocation(), item.getYLocation())==0.0) {
			player.setInitialLocation();
			item.setInitialLocation();
		}
	}
	
	public void loop() {
		Component frame = null;
		do {
			
			double distance = compass.distanceToItem(player.getXLocation(), player.getYLocation(), item.getXLocation(), item.getYLocation());
			
			System.out.println("The dial reads: " + distance);
			
			Object[] options = { "North", "South", "East", "West" };
			int n = JOptionPane.showOptionDialog(frame, "Pick one",
					"Decision", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
					options[3]);
			
			switch(n) {
			case 0:
				player.move("N");
				System.out.println(MovementDirection.NORTH.toString());
				break;
			case 1:
				player.move("S");
				System.out.println(MovementDirection.SOUTH.toString());
				break;
			case 2:
				player.move("E");
				System.out.println(MovementDirection.EAST.toString());
				break;
			case 3:
				player.move("W");
				System.out.println(MovementDirection.WEST.toString());
				break;
			default:
				break;
			}
			if(distance == 0.0) {
				playing = false;
				JOptionPane.showMessageDialog(frame, "You see a box sitting on the plain. It�s filled with treasure! You win! The end.");
			}
		} while(playing);
		
		}
	}

