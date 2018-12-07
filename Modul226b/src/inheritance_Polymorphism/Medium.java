package inheritance_Polymorphism;

public class Medium {
	private String title;
	private boolean gotIt;
	private String comment;
	
	public Medium(String title, boolean gotIt, String comment)
	{
		this.title = title;
		this.gotIt = gotIt;
		this.comment = comment;
	}
	
	public void print() {
		System.out.println("Simple Print Out");
		System.out.println("Title: " + title);
		if (gotIt) {
			System.out.println("Have it");
		} else {
			System.out.println();
		}
		System.out.println("Comment: " + comment);
		System.out.println("\n####################\n");
	}
}
