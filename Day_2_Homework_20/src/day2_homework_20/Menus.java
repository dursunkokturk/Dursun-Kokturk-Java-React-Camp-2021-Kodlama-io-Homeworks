package day2_homework_20;

public class Menus {
	public Menus() {
		System.out.println("Menus");
	}
	
	public Menus (int id,String name) {
		this();
		this.id = id;
		this.name = name;
	}
	int id;
	String name;
}
