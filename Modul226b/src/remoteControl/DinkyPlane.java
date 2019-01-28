package remoteControl;

public class DinkyPlane implements Movable{
	
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

	public int getFuel() {
		return fuel;
	}

	@Override
	public int remainingKm() {
		return 0;
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
