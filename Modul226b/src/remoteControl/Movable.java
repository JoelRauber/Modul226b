package remoteControl;

public interface Movable {
	
	boolean start ();
	void stop ();
	boolean turn (int degrees);
	double fuelRemaining ();
	boolean changeSpeed (double kmperhour);
}
