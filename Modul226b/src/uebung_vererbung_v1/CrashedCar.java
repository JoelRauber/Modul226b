package uebung_vererbung_v1;

public class CrashedCar extends Car{
	
	private int damageLevel;

	public CrashedCar(String modell, int price, int damageLevel) {
		super(modell, price);
		this.damageLevel = damageLevel;
	}
	
}
