package javaAssessmentTest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.Compass;
import main.Item;
import main.Player;

public class JavaAssessmentTest {
	private boolean test = false;

	@Test
	public void test() {
		
		Player player = new Player();
		Compass compass = new Compass();
		Item item = new Item();
		
//		player.setInitialLocation();
		assertNotSame(0, player.xLocation);
		
		
		
//		assertEquals(true, test );
	}

}
