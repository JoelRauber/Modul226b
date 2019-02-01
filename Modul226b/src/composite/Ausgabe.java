package composite;

/**
 * Ausgabe.java
 * @author Joel & Michael
 * @version 31.01.2019
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ausgabe {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	
	public static void main(String[] args) {
		
		//Hirarchie wird erstellt
		
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
	    
	    List<Abteilungsleiter> abteilungsleiter = new ArrayList<Abteilungsleiter>();
		abteilungsleiter.add(abteilungsleiter1);
		abteilungsleiter.add(abteilungsleiter2);
		abteilungsleiter.add(abteilungsleiter3);
		
		boolean active = true;
		
		System.out.println("---------------Composite---------------\n");
		
		//Damit das Programm nicht nach einem Durchlauf abbricht.
		
		while(active) {
			String thema = getThema();
			switch(thema) {
				case "a": 
					System.out.println("\n");
					getHirarchy(vorstand);
					System.out.println("\n");
					break;
				case "b":
					addMitarbeiter(abteilungsleiter);
					System.out.println("\n");
					break;
				case "c":
					System.out.println("\n");
					removeMitarbeiter(vorstand, abteilungsleiter1, abteilungsleiter2, abteilungsleiter3);
					System.out.println("\n");
					break;
				case "d":
					
					active = false;
					System.out.println("Programm wurde geschlossen!");
					break;
			}
		}
	}
	
	
	/**
	 * Methode damit Mitarbeiter hinzugefügt werden kann
	 *
	 * @param abteilungsleiter the abteilungsleiter
	 */
	
	private static void addMitarbeiter(List<Abteilungsleiter> abteilungsleiter) {
		System.out.println("Mitarbeiter hinzufügen");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welchem Abteilungsleiter wollen Sie den Mitarbeiter hinzufügen?");
		String name = scanner.nextLine();
		
		for(Abteilungsleiter ma : abteilungsleiter) {
			if(ma.getName().equals(name)) {
				
				Scanner scannerName = new Scanner(System.in);
				System.out.println("Name: ");
				String maName = scannerName.nextLine(); 
				
				Scanner scannerTel = new Scanner(System.in);
				System.out.println("Tel:");
				int tel = scannerTel.nextInt();
				
				Mitarbeiter newMitarbeiter = new AtomarerMitarbeiter(maName, tel);
				
				ma.add(newMitarbeiter);
			}
		}
		
	}
	
	/**
	 * Methode damit Mitarbeiter gelöscht werden kann.
	 *
	 * @param vorstand the vorstand
	 * @param abteilungsleiter1 der erste Abteilungsleiter
	 * @param abteilungsleiter2 der zweiter Abteilungsleiter
	 * @param abteilungsleiter3 der dritte Abteilungsleiter
	 */

	private static void removeMitarbeiter(Abteilungsleiter vorstand, Abteilungsleiter abteilungsleiter1, Abteilungsleiter abteilungsleiter2, Abteilungsleiter abteilungsleiter3) {
		
		System.out.println("Abteilung löschen");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welche Abteilung wollen Sie löschen?");
		System.out.println("a) Entwicklung");
		System.out.println("b) Technologie");
		System.out.println("c) Vertrieb");
		
		String abteilung = scanner.nextLine();
		switch(abteilung) {
			case "a": 
				vorstand.remove(abteilungsleiter3);
				break;
			case "b":
				vorstand.remove(abteilungsleiter2);
				break;
			case "c": 
				vorstand.remove(abteilungsleiter1);
				break;
		}
	}
	
	/**
	 * Methode damit die Hierarchie ausgeben wird.
	 *
	 * @param vorstand, damit man den ganzen print()-Aufruf starten kann.
	 */

	public static void getHirarchy(Mitarbeiter vorstand) {
	    vorstand.print("");
	}
	
	
	/**
	 * Methode damit das Menu ausgegeben wird
	 *
	 * @return gibt das ausgewählte Thema zurück.
	 */
	
	public static String getThema() {
		boolean fehler = true;
		String thema;
		
		while(fehler) {
			@SuppressWarnings("resource")
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Was wollen Sie machen?");
			System.out.println("a) Hierarchie ansehen");
			System.out.println("b) Atomarer Mitarbeiter hinzufügen");
			System.out.println("c) Abteilung löschen");
			System.out.println("d) Verlassen");
			
			thema = scanner.nextLine();
			if(thema.matches("[a-dA-D]+"))
			{
				fehler = false;
				return thema;
			}
		}
		return getThema();
	}

}
