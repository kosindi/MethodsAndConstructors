
public class Room {
	private String color;
	private String floor;
	private String windows;
	public Room() {
		this.color = "yellow";
		this.floor = "hard wood";
		this.windows = "1";
		//default constructor-no argument
	}
	
	public Room(String color, String floor, String windows) {
		this.color = color;
		this.floor = floor;
		this.windows = windows;
		//non default constructor-argument in the parenthesis 
	}
	
	public String getColor() {
		return this.color;//returns value
	}
	
	public void setColor(String color) {
		this.color = color;//changes value
	}
	
	public String getFloor() {
		return this.floor;//returns value
	}
	
	public void setFloor(String floor) {
		this.floor = floor;//changes value
	}
	
	public String getWindows() {
		return this.windows;//returns value
	}
	
	public void setWindows(String windows) {
		this.windows = windows;//changes value
	}
	
	public String string1() {
		return "The walls are " + this.color + ", the floor is " + 
	this.floor + ", and there are " + this.windows + " windows.";
	}//print method
	
	

}
