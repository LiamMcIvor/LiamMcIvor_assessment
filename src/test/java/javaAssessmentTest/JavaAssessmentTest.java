package javaAssessmentTest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.Compass;
import main.Item;
import main.Location;
import main.Player;

public class JavaAssessmentTest {
	private boolean test = false;

	@Test
	public void test() {
		
		Player player = new Player();
		Compass compass = new Compass();
		Item item = new Item();
		Location location = new Location();
		
		player.setInitialLocation();
		assertNotSame(0, player.xLocation);
		assertNotSame(0, player.yLocation);
		
		item.setInitialLocation();
		assertNotSame(0, item.xLocation);
		assertNotSame(0, item.yLocation);
		
		location.setInitialLocation();
		assertNotSame(0, location.xLocation);
		assertNotSame(0, location.xLocation);
		
		player.move("N");
		
//		assertNotSame(player.xLocation, player.move("N"));
		
		
//		assertEquals(true, test );
	}

}
