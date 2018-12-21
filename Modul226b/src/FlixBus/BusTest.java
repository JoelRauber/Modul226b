package FlixBus;

import org.junit.*;

public class BusTest {
	
	private Bus createNationalBus() {
		SmallBus smallBus = new SmallBus();
		smallBus.setNational(true);
		smallBus.setInternational(false);
		smallBus.setPassengerCapacity(20);
		
		return smallBus;
	}
	
	private Bus createInternationalBus() {
		SmallBus smallBus = new SmallBus();
		smallBus.setNational(false);
		smallBus.setInternational(true);
		smallBus.setPassengerCapacity(20);
		
		return smallBus;
	}
	
	@Test
	public void isNationalBus() {
		//Act
		SmallBus bus = (SmallBus) createNationalBus();
		
		//Assert
		Assert.assertEquals(true, bus.national);
	}
	
	@Test
	public void isInternationalBus() {
		//Act
		SmallBus bus = (SmallBus) createInternationalBus();
				
		//Assert
		Assert.assertEquals(true, bus.international);
	}
}
