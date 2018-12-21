package FlixBus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.INTERNAL;

public class Relation {
	
	private static String INTERNATIONAL = "International";
	private static String NATIONAL = "National";
	private static List<Travel> travels = new ArrayList<Travel>();
	
	public static void main(String[] args) {
		System.out.println("Relation");
		
		Platform platform1NewYork = new Platform();
		platform1NewYork.setBusService(NATIONAL);
		platform1NewYork.setNumber(1);
		platform1NewYork.setOccupied(false);
		platform1NewYork.setSize(3);
		
		Platform platform2NewYork = new Platform();
		platform2NewYork.setBusService(INTERNATIONAL);
		platform2NewYork.setNumber(2);
		platform2NewYork.setOccupied(false);
		platform2NewYork.setSize(5);
		
		Platform platform3NewYork = new Platform();
		platform3NewYork.setBusService(NATIONAL);
		platform3NewYork.setNumber(3);
		platform3NewYork.setOccupied(false);
		platform3NewYork.setSize(10);
		
		BusTerminal terminalNewYork = new BusTerminal();
		terminalNewYork.setNumber(1);
		terminalNewYork.listPlatforms.add(platform1NewYork);
		terminalNewYork.listPlatforms.add(platform2NewYork);
		terminalNewYork.listPlatforms.add(platform3NewYork);
		
		Travel travelFromNewYorkToLondon = new Travel(terminalNewYork.getNumber());	
		travelFromNewYorkToLondon.setDestination("London");
		travelFromNewYorkToLondon.setDepartureTime("7/10/2018 07:05:19 AM");
		travelFromNewYorkToLondon.setArrivalTime("7/10/2018 08:19 PM");
		travelFromNewYorkToLondon.setInternational(true);
		travels.add(travelFromNewYorkToLondon);
		
		platform3NewYork.setOccupied(true);
		
		System.out.println("Create your own national travel");
		Travel travelOwn = new Travel(terminalNewYork.getNumber());
		
		Scanner scannerDestination = new Scanner(System.in);
		System.out.println("Destination: ");
		travelOwn.setDestination(scannerDestination.nextLine());
		
		Scanner scannerDepartureTime= new Scanner(System.in);
		System.out.println("Departure Time: ");
		travelOwn.setDepartureTime(scannerDepartureTime.nextLine());
		
		Scanner scannerArrivalTime = new Scanner(System.in);
		System.out.println("Arrival Time: ");
		travelOwn.setArrivalTime(scannerArrivalTime.nextLine());
		
		travelOwn.setNational(true);
		
		travels.add(travelOwn);
		
		System.out.println("List of platforms which are available:");
		
		for(Platform platform : terminalNewYork.listPlatforms) {
			if(platform.getBusService() == INTERNATIONAL || platform.isOccupied()) {
				break;
			}
			else {
				System.out.println("Platform " + platform.getNumber() + " and a size of: " + platform.getSize());
			}
		}		
		Scanner scannerBus = new Scanner(System.in);
		
		System.out.println("Ihre Reise wurde gebucht\n\n");
		
		System.out.println("Es ist kein grosser Bus, da es eine nationale Reise ist.");
		
		SmallBus smallBus = new SmallBus();
		smallBus.setNational(true);
		smallBus.setInternational(true);
		smallBus.setPassengerCapacity(20);
		
		System.out.println("Alle Abfahrtszeiten");
		
		for(Travel travel : travels) {
			System.out.println("Von New York nach " + travel.getDestination() + " fährt am " + travel.getDepartureTime() + " ab!");
		}
	}
}