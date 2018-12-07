package inheritance_Polymorphism;

public class Ausgabe {

	public static void main(String[] args) {
		Database db = new Database();
		
		Medium book = new Book("Wall of Sound", true, "Bestes Buch");
		Medium video = new Video("24 Hour Challenge", true, "Beste Challenge");
		Medium cd = new CD("Die drei ???", true, "Beste CD");
		
		db.addMedium(book);
		db.addMedium(video);
		db.addMedium(cd);
		
		db.printList();
	}

}
