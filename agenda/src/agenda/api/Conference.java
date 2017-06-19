package agenda.api;

public class Conference {
	String name;
	String location;
	
	public Conference() {
	}

	public Conference(String n, String l) {
		this.name = n;
		this.location = l;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
