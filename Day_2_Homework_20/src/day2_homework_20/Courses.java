package day2_homework_20;

public class Courses {
	public Courses() {
		System.out.println("Courses");
	}
	
	public Courses (int id,String name,String detail) {
		this.id = id;
		this.name = name;
		this.detail = detail;
	}
	
	int id;
	String name;
	String detail;
}
