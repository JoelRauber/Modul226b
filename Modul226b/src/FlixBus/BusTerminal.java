package FlixBus;

import java.util.ArrayList;
import java.util.List;

public class BusTerminal {
	protected List<Platform> listPlatforms = new ArrayList<Platform>();
	protected String name;
	protected int number;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public List<Platform> getListPlatforms() {
		return listPlatforms;
	}
	public void setListPlatforms(List<Platform> listPlatforms) {
		this.listPlatforms = listPlatforms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
