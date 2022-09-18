package day2_homework_20;

public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses(1,"Javascript Software Developer Camp","1.5 Months Long Camp");
		Courses course2 = new Courses(2,"C# & Angular Software Developer Camp","1.5 Months Long Camp");
		Courses course3 = new Courses(1,"Java & React Software Developer Camp","1.5 Months Long Camp");
		
		Courses[] courses = {course1,course2,course3};
		
		for (Courses course : courses) {
			System.out.println(course.name);
		}
		
		System.out.println("Total Courses Numbers : "+courses.length);
		
		Menus menu1 = new Menus(1,"My Courses");
		Menus menu2 = new Menus(2,"All Courses");
		Menus menu3 = new Menus(3,"Preparation to Courses");

	}
}