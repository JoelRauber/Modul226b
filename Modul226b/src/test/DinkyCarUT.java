package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import remoteControl.DinkyCar;

public class DinkyCarUT {
	
	DinkyCar dinkyCar;
	
	@Before
	public void before() {
		dinkyCar = new DinkyCar(300, 0, 70);
	}

	@Test
	public void testConstructor() {
		DinkyCar dinkyCar = new DinkyCar(200, 0, 50);
	}
	
	@Test(expected = java.lang.Error.class)
	public void failConstructor() {
		DinkyCar dinkyCar = new DinkyCar();
	}
	
	@Test
	public void testTurn() {
		assertEquals(dinkyCar.turn(40), true);
	}
	
}
