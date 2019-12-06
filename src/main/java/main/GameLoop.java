package main;

import java.awt.Component;

import javax.swing.JOptionPane;

public class GameLoop {

	private boolean playing = true;
	Player player = new Player();
	Compass compass = new Compass();
	Location local = new Location();
	
	public void initializeObjects() {
		player.setInitialPlayerLocation();
		local.setItemLocation();
	}
	
	public void loop() {
		Component frame = null;
		do {
			double distance = compass.distanceToItem(player.getPlayerXLocation(), player.getPlayerYLocation(), local.getItemXLocation(), local.getItemYLocation());
			if(distance == 0.0) {
				playing = false;
				JOptionPane.showMessageDialog(frame, "You see a box sitting on the plain. It’s filled with treasure! You win! The end.");
//				System.out.println("You see a box sitting on the plain. It’s filled with treasure! You win! The end.");
			}
			System.out.println("The dial reads: " + distance);
			
			Object[] options = { "North", "South", "East", "West" };
			int n = JOptionPane.showOptionDialog(frame, "Pick one",
					"Decision", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
					options[3]);
			switch(n) {
			case 0:
				player.move("N");
				break;
			case 1:
				player.move("S");
				break;
			case 2:
				player.move("E");
				break;
			case 3:
				player.move("W");
				break;
			default:
				break;
			}
		} while(playing);
		
		}
	}

