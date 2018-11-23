package inheritance_Polymorphism;

public class UsedCar extends Car{

	private int mileage;
	
	public UsedCar(int mileage, String modell, int price) {
		super(modell, price);
		this.mileage = mileage;
	}
	
}
