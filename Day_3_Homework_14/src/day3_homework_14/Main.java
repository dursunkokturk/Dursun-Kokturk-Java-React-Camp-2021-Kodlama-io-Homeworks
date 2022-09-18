package day3_homework_14;

public class Main {

	public static void main(String[] args) {
		
		// Parametreli Constructor Kullanarak Menulerin Yazdirilmasi
		// Her Kullanici Turunde Goruntulenecek
		System.out.println("Menus");
		Menus menu1 = new Menus(1,"Kurslar�m");
		Menus menu2 = new Menus(2,"T�m Kurslar");
		Menus menu3 = new Menus(3,"Kampa Haz�rl�k");
		Menus menu4 = new Menus(4,"S�k Sorulan Sorular");
		
		Menus menus[]= {menu1,menu2,menu3,menu4};
		for (Menus menu : menus) {
			System.out.println(menu.menuName);
		}
		System.out.println("");
		
		
		
		
		
		// Parametreli Constructor Kullanarak Kurslarin Yazdirilmasi
		// Her Kullanici Turunde Goruntulenecek
		System.out.println("All Courses");
		
		Courses course1 = new Courses(1,"JavaScript Yaz�l�m Geli�tirici Yeti�tirme Kamp�",
										"1.5 Ay S�recek E�itim",
										"Her Seviye ��in");
		Courses course2 = new Courses(2,"Java & React Yaz�l�m Geli�tirici Yeti�tirme Kamp�",
										"1.5 Ay S�recek E�itim",
										"Her Seviye ��in");
		Courses course3 = new Courses(3,"C# & Angular Yaz�l�m Geli�tirici Yeti�tirme Kamp�",
										"1.5 Ay S�recek E�itim",
										"Her Seviye ��in");
		Courses course4 = new Courses(4,"Programlamaya Giri� ��in Temel Kurs",
										"Programlama Hakk�nda Bilgim Yok Yada Az Bir �ey Biliyorum Diyenler ��in",
										"Her Seviye ��in");
		
		Courses courses[]= {course1,course2,course3,course4};
		for (Courses course : courses) {
			System.out.println("Course Name : "+course.courseName +" "+"Course Detail : "+course.courseDetail+" "+"Course Comment : "+course.courseComment1);
		}
		
		System.out.println("");
		
		
		
		
		
		// Parametreli Constructor Kullanarak Ogrencilerin Kurs Bilgilerini Gormesi
		System.out.println("Students");
		Student student1 = new Student(1,"Dursun","K�kt�rk","dursunkokturk@gmail.com","Programlamaya Giri� ��in Temel Kurs","Programlama Hakk�nda Bilgim Yok Yada Az Bir �ey Biliyorum Diyenler ��in","Hi� Bilmiyorum Diyenlere Temel Bilgiyi Veriyor");
		Student student2 = new Student(2,"Hakan","Acar","hakanacar@gmail.com","Programlamaya Giri� ��in Temel Kurs","Programlama Hakk�nda Bilgim Yok Yada Az Bir �ey Biliyorum Diyenler ��in","Hi� Bilmiyorum Diyenlere Temel Bilgiyi Veriyor");
		Student student3 = new Student(3,"Sefa","Ak","sefaak@gmail.com","Programlamaya Giri� ��in Temel Kurs","Programlama Hakk�nda Bilgim Yok Yada Az Bir �ey Biliyorum Diyenler ��in","Hi� Bilmiyorum Diyenlere Temel Bilgiyi Veriyor");
		
		// Ogrenci Bilgilerinin Yer Aldigi Objelerin Array Tipinde Yazdirilmasi
		Student[] students = {student1,student2,student3};
			for (Student student : students) {
				System.out.println("First Name : "+student.studentFirstName +" "+
					"Last Name : "+ student.studentLastName +
					" Email : "+ student.studentEmail +" "+
					" Course Name : "+ student.courseName +" "+
					" Cours Detail : "+ student.courseDetail +" "+
					" Course Comment : "+ student.courseComment1);
				}
		System.out.println("");
		
		
		
		
		
		
		// Takip Edilen Kurslarin Yazdirilmasi
		System.out.println("Kayitli Kullanicinin Takip Ettigi Kurslar");
		MyCourses myCourse1 = new MyCourses(1,"Programlamaya Giri� ��in Temel Kurs","Programlama Hakk�nda Bilgim Yok Yada Az Bir �ey Biliyorum Diyenler ��in","Hi� Bilmiyorum Diyenlere Temel Bilgiyi Veriyor");
		
		MyCourses myCourses[] = {myCourse1};
		for (MyCourses myCourse : myCourses) {
			System.out.println("Course Name : "+myCourse.courseName+" "+
					" Course Detail : "+ myCourse.courseDetail+" "+
					" Course Comment : "+ myCourse.courseComment1);
		}
		System.out.println("");
		
		
		
		
		
		
		// Egitmen Bilgilerinin Parametreli Constructor Kullanarak Yazdirilmasi
		System.out.println("Instructor Info");
		Instructor instructor1 = new Instructor(1,"Engin","Demiro�","engindemirog@gmail.com","Hi� Bilmiyorum Diyenlere Temel Bilgiyi Veriyor");
		
		Instructor instructors[]= {instructor1};
		for (Instructor instructor : instructors) {
			System.out.println(instructor.instructorFirstName +" "+ 
					instructor.instructorLastName+" "+
					instructor.instructorEmail+" "+
					instructor.courseComment1);
		}
		System.out.println("");
		
		
		
		
		
		// Ogrenci 
		// Yorum Yapma 
		// Yorum Silme 
		// Video Izleme Islemlerinin Yapilmasi
		StudentManager studentManager = new StudentManager();
		studentManager.videoWatch(course3);
		studentManager.addComment(student3);
		studentManager.deleteComment(student3);
		System.out.println("");
		
		
		
		
		
		// Egitmenin Kurs Eklemesi
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(course4);
		instructorManager.deleteCourse(course4);
		instructorManager.deleteComment(course4);
		//instructorManager.deleteUser(user1);
		
	}
}