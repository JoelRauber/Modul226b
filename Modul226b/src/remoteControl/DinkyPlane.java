package remoteControl;

public class DinkyPlane implements Movable{
	
	private int fuel;

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double fuelRemaining() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean changeSpeed(double kmperhour) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getFuel() {
		return fuel;
	}

	@Override
	public int remainingKm() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}


}
