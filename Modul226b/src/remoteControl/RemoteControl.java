package remoteControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoteControl {
	public void steuern(Movable movable) throws IOException {
		int choice = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			printMenue(movable);
			do {
				choice = readLine(br);
			}while(choice == 0);
			switch (choice) {
			case 1:
				movable.start();
				break;
			case 2:
				movable.stop();
				choice = 0;
				break;
			case 3:
				System.out.println("Um wie viel Grad?");
				int turnDegres;
				do {
					turnDegres = readLine(br);
				}while(turnDegres == 0);
				movable.turn(turnDegres);
				break;
			case 4:
				System.out.println("Treibstoff in %:" + movable.fuelRemaining());
				break;
			case 5:
				System.out.println("Neue Geschwindigkeit: " + movable.changeSpeed(10) + " km/h");
			default:
				choice = 0;
			}
		} while (choice != 0);
	}

	private int readLine(BufferedReader br) {
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception e) {
			return 0;
		}
	}

	private void printMenue(Movable movable) {
		System.out.println("Menue-Auswahl: ");
		System.out.println("[1] " + movable.toString() + " starten");
		System.out.println("[2] " + movable.toString() + " stoppen");
		System.out.println("[3] " + movable.toString() + "richtung aendern");
		System.out.println("[4] Treibstoffkontrolle");
		System.out.println("[5] Geschwindigkeitsänderung");
	}
}
