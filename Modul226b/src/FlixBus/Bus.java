package FlixBus;

public class Bus {
	protected String busType;
	protected int passengerCapacity;
	protected String comfort;
	protected boolean national;
	protected boolean international;
	protected String busService;
	
	public String getBusService() {
		if(this.national) {
			this.busService = "National";
		}
		else {
			this.busService = "International";
		}
		return this.busService;
	}
	
	public boolean isNational() {
		return national;
	}
	public void setNational(boolean national) {
		this.national = national;
	}
	public boolean isInternational() {
		return international;
	}
	public void setInternational(boolean international) {
		this.international = international;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public String getComfort() {
		return comfort;
	}
	public void setComfort(String comfort) {
		this.comfort = comfort;
	}
	
	@Override
	public String toString() {
		
		return "Ihr Bus ist ein und hat für " + passengerCapacity + " Personen platz.";
	}
	
	//Overload
	public void busView() {
		System.out.println("Your bus is a normal bus and has a first class comfort.");
	}
	
	public void busView(String BusService) {
		System.out.println("Your bus is a " + busService + " bus and has a first class comfort.");
	}
}
