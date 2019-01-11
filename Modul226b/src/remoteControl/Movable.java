package remoteControl;

public interface Movable {
	
	boolean start ();
	void stop ();
	double fuelRemaining ();
	boolean changeSpeed (double kmperhour);
	int remainingKm();
}
