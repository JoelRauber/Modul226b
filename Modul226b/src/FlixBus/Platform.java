package FlixBus;

public class Platform {
	protected int number;
	protected int size;
	protected String busService;
	protected int busCount = 0;
	protected boolean occupied;
	
	
	
	public int getBusCount() {
		return busCount;
	}
	public void setBusCount(int busCount) {
		this.busCount = busCount;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBusService() {
		return busService;
	}
	public void setBusService(String busService) {
		this.busService = busService;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
}
