package day3_homework_14;

public class Student extends BaseClass{
	
	// Ogrenci Adi Soyadi Email Bilgileri Ile Instructor Bilgileri Farkli Oldugu Icin 
	// Birde Database Icinde Farkli Tablolarda Yer Alacagindan Farklý Degisken Adlari Kullanildi
	// Instructor Ile Ortak Degisken Kullanilmadi
	String studentFirstName;
	String studentLastName;
	String studentEmail;
	
	public Student(int id,String studentFirstName,String studentLastName,String studentEmail,String courseName,String courseDetail,String courseComment) {
		super(studentFirstName,studentLastName,studentEmail,courseName,courseDetail,courseComment,studentEmail);
		
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentEmail = studentEmail;
	}
}