package day3_homework_14;

public class StudentManager {
	
	// Student Video Watch
	public void videoWatch(BaseClass baseClass) {
		System.out.println("Video Watch");
		
	}
	public void addComment(Student student) {
		System.out.println("Add Student Comment : " +student.courseComment1);
	}
	public void deleteComment(Student student) {
		System.out.println("Delete Student Comment  : "+student.courseComment1);
	}
}