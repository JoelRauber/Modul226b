package composite;

public class Ausgabe {
	public static void main(String[] args) {
		
	    Abteilungsleiter abteilungsleiter1 = new Abteilungsleiter("W. Fischer", "Vertrieb", 001);
	    abteilungsleiter1.add(new AtomarerMitarbeiter("P. Meier", 123));
	    abteilungsleiter1.add(new AtomarerMitarbeiter("I. Schulz", 112));
	    
	    Abteilungsleiter abteilungsleiter2 = new Abteilungsleiter("T. Kunz", "Technologie", 002);
	    abteilungsleiter2.add(new AtomarerMitarbeiter("M. Rehberg", 223));
	    abteilungsleiter2.add(new AtomarerMitarbeiter("O. Riedel", 212));
	    
	    Abteilungsleiter abteilungsleiter3 = new Abteilungsleiter("M. Hardbrot", "Entwicklung", 003);
	    abteilungsleiter3.add(new AtomarerMitarbeiter("M. Rehberg", 323));
	    abteilungsleiter3.add(abteilungsleiter2);
	    
	    Abteilungsleiter vorstand = new Abteilungsleiter("A. Müller", "Vorstand", 004);
	    vorstand.add(abteilungsleiter1);
	    vorstand.add(new AtomarerMitarbeiter("U. Temann", 442));
	    vorstand.add(abteilungsleiter3);

	    vorstand.print("");
	}

}
