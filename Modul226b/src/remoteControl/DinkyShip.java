package remoteControl;

public class DinkyShip implements Movable {

	double fuel;
	int richtung;
	int speed;

	public DinkyShip(double fuel, int richtung, int speed) {
		this.fuel = fuel;
		this.richtung = richtung;
		this.speed = speed;
	}

	public boolean start() {
		System.out.println("Schiff wird gestartet");
		return true;
	}

	public void stop() {
		System.out.println("Schiff wird gestoppt");
	}

	public boolean turn(int degrees) {
		richtung = richtung + degrees;
		System.out.println("neue Richtung:" + richtung);
		return true;
	}

	public double fuelRemaining() {
		fuel = fuel - 30;
		return fuel;
	}

	@Override
	public int changeSpeed(int kmperhour) {
		speed = speed + 10;
		return speed;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
}
