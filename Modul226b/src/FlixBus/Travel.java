package FlixBus;

import java.sql.Time;

public class Travel {
	protected String destination;
	protected String departureTime;
	protected String arrivalTime;
	protected boolean national;
	protected boolean international;
	protected int busTerminalNumber;
	
	public Travel(int number) {
		this.busTerminalNumber = number;
	}
	
	public int getBusTerminalNumber() {
		return busTerminalNumber;
	}
	public void setBusTerminalNumber(int busTerminalNumber) {
		this.busTerminalNumber = busTerminalNumber;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
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
	
	
}
