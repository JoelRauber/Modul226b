package inheritance_Polymorphism;

import java.util.ArrayList;
	
	public class Database {
		private ArrayList<Medium> media;
		public Database() 
		{
			media= new ArrayList<Medium>();
		}
		public void addMedium(Medium medium)
		{
			media.add(medium);
		}
		public void printList()
		{
			for(Medium medium : media) 
			{
				medium.print();
			}
		}
	}
