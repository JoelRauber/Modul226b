package remoteControl;

public class DinkyCar implements Movable{
	
	@Override
	public boolean start() {
		return false;
	}

	@Override
	public void stop() {
		
	}

	@Override
	public boolean turn(int degrees) {
		return false;
	}

	@Override
	public double fuelRemaining() {
		return 0;
	}

	@Override
	public boolean changeSpeed(double kmperhour) {
		return false;
	}

}
