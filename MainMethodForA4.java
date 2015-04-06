
public class MainMethodForA4 {
	public static void main (String[] args) {
		Room room1 = new Room();//default constructor
		System.out.println(room1.string1());
		Room room2 = new Room("purple", "tiled", "no");//non default constructor
		System.out.println(room2.string1());
		Room room3 = new Room("", "", "");//non default constructor
		room3.setColor("white");
		room3.setFloor("carpeted");
		room3.setWindows("3");
		System.out.println(room3.getColor());
		System.out.println(room3.getFloor());
		System.out.println(room3.getWindows());
		System.out.println(room3.string1());
	}
	
	

}
