package day3_homework_14;

public class BaseClass {

	// Egitim Sitesi Oldugundan Dolayý Menu Adlari ve Kurs Adlari Baz Alinarak
	// Hem Student Class ta Hem de Instructor Class ta Ortak Olarak Yer Aliyor.
	// Degiskenlere Atanan Degerler Ayni Oldugunda Dolayi
	// Menu Bilgileri Ve Kurs Bilgileri Bu Kisimda Yer Aliyor
	int id;
	
	String menuName;
	
	String courseName;
	String courseDetail;
	String courseComment1;
	String courseComment2;
	
	// Menuler Icin Parametreli Constructor
	public BaseClass(int id, String menuName) {
		
		// this Anahtar Kelimesi Kullanilarak Class Icindeki Degiskene
		// Sonradan Atanan Degerin Parametrede Yer Alan Degisken Adlari Uzerinden Aktarilmasi Saglaniyor
		this.id = id;
		this.menuName = menuName;
	}
	
	
	// Kurslar Icin Parametreli Constructor
	public BaseClass(int id, String courseName,String courseDetail,String courseComment) {
		
		// this Anahtar Kelimesi Kullanilarak Class Icindeki Degiskene
		// Sonradan Atanan Degerin Parametrede Yer Alan Degisken Adlari Uzerinden Aktarilmasi Saglaniyor
		this.id = id;
		this.courseName = courseName;
		this.courseDetail = courseDetail;
		this.courseComment1 = courseComment;
	}

	// Student Icin Parametreli Constructor
	public BaseClass(String studentFirstName,String studentLastName,String studentEmail,String courseName,String courseDetail,String courseComment3,String studentEmail2) {
		
		// this Anahtar Kelimesi Kullanilarak Class Icindeki Degiskene
		// Sonradan Atanan Degerin Parametrede Yer Alan Degisken Adlari Uzerinden Aktarilmasi Saglaniyor
		this.courseName = courseName;
		this.courseDetail = courseDetail;
		this.courseComment2 = courseComment2;
		
	}

	// Instructor Icin Parametreli Constructor
	public BaseClass(String instructorFirstName,String instructorLastName,String instructorEmail,String courseComment2) {
		
		// this Anahtar Kelimesi Kullanilarak Class Icindeki Degiskene
		// Sonradan Atanan Degerin Parametrede Yer Alan Degisken Adlari Uzerinden Aktarilmasi Saglaniyor
		this.courseComment2 = courseComment2;
	}
	
}