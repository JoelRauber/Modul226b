package remoteControl;

public class DinkyCar implements Movable{
	
	private int fuel;
	private int weight;
	
	@Override
	public boolean start() {
		return false;
	}

	@Override
	public void stop() {
		
	}

	@Override
	public double fuelRemaining() {
		return 0;
	}

	@Override
	public boolean changeSpeed(double kmperhour) {
		return false;
	}
	
	@Override
	public int remainingKm() {
		return 0;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
