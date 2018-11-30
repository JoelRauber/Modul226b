package uebung_vererbung_v1;

public class Car {

	private String modell;
	private double price;
	
	public Car(String modell, double price) {
		this.modell = modell;
		this.price = price;
	}
	
	protected double getCarPrice() {
		return price;
	}
	
}
