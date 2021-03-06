package remoteControl;

public class DinkyPlane implements Movable {
	private double fuel;
	private int richtung;
	private int speed;

	public DinkyPlane(double fuel, int richtung, int speed) {
		this.fuel = fuel;
		this.richtung = richtung;
		this.speed = speed;
	}

	public boolean start() {
		System.out.println("Modellflugzeug wird gestartet");
		return true;
	}

	public void stop() {
		System.out.println("Modellflugzeug wird gestoppt");
	}

	public boolean turn(int degrees) {
		richtung = richtung + degrees;
		System.out.println("neue Richtung:" + richtung);
		return true;
	}

	public double fuelRemaining() {
		fuel = fuel - 10;
		return fuel;
	}

	@Override
	public int changeSpeed(int kmperhour) {
		speed = speed +15;
		return speed;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
}