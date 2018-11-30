package inheritance_polymorphism;

import java.util.ArrayList;

public class Database {
	
	private ArrayList<CD> cds;
	private ArrayList<Video> videos;

	public Database() {
		cds = new ArrayList<CD>();
		videos = new ArrayList<Video>();
	}

	public void addCD(CD cd) {
		cds.add(cd);
	}

	public void addVideo(Video video) {
		videos.add(video);
	}
	
	

	public void printList() {
		
		// print list of CDs
		for (CD cd : cds) {
			cd.print();
		}

		// print list of videos
		for (Video video : videos) {
			video.print();
		}
		
		
	}

}
