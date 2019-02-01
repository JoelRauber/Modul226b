package remoteControl;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		DinkyPlane dinkyPlane = new DinkyPlane(2000, 0, 180);
		DinkyShip dinkyShip = new DinkyShip(1500,0,50);
		DinkyCar dinkyCar = new DinkyCar(300, 0, 120);
		RemoteControl rc = new RemoteControl();
		rc.steuern(dinkyShip);
		rc.steuern(dinkyPlane);
		rc.steuern(dinkyCar);
	}

}
