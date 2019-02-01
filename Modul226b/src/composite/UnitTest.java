package composite;

/**
 * UnitTest.java
 * @author Joel & Michael
 * @version 31.01.2019
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {

	/**
	 * Test get mitarbeiter anzahl.
	 */
	
	@Test
	public void TestGetMitarbeiterAnzahl() {
		//Arrange
		Abteilungsleiter abteilungsleiter = new Abteilungsleiter("W. Fischer", "Vertrieb", 001);
		Abteilungsleiter vorstand = new Abteilungsleiter("A. Müller", "Vorstand", 004);
	    vorstand.add(abteilungsleiter);
	    
	    //Act 
	    int before = vorstand.getMitarbeiterAnzahl();
	    
	    //Assert
	    assertTrue(before >= 1);
	}
	
	/**
	 * Test remove abteilung.
	 */
	
	@Test
	public void TestRemove_Abteilung() {
		//Arrange
		Abteilungsleiter abteilungsleiter = new Abteilungsleiter("W. Fischer", "Vertrieb", 001);
		Abteilungsleiter vorstand = new Abteilungsleiter("A. Müller", "Vorstand", 004);
	    vorstand.add(abteilungsleiter);
	    int before = vorstand.getMitarbeiterAnzahl();
	    
	    //Act
	    vorstand.remove(abteilungsleiter);
	    
	    //Assert
	    assertTrue(before > vorstand.getMitarbeiterAnzahl());
	}
	
	/**
	 * Test add atomarer mitarbeiter.
	 */
	
	@Test
	public void TestAdd_AtomarerMitarbeiter() {
		//Arrange
		Abteilungsleiter vorstand = new Abteilungsleiter("A. Müller", "Vorstand", 004);
		
	    //Act
		vorstand.add(new AtomarerMitarbeiter("U. Temann", 442));
	    
	    //Assert
	    assertTrue(vorstand.getMitarbeiterAnzahl() > 0);
	}
	
	/**
	 * Test add atomarer mitarbeiter fail.
	 */
	
	@Test
	public void TestAdd_AtomarerMitarbeiter_Fail() {
		//Arrange
		Abteilungsleiter vorstand = new Abteilungsleiter("A. Müller", "Vorstand", 004);
		
	    //Act
		vorstand.add(new AtomarerMitarbeiter("U. Temann", 442));
	    
	    //Assert
	    assertFalse(vorstand.getMitarbeiterAnzahl() < 0);
	}

}
