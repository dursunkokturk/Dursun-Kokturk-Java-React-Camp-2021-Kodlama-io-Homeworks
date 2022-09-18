package day3_homework_14;

public class Instructor extends BaseClass{
	
	// Instructor Bilgileri ve Ogrenci Adi Soyadi Email Bilgileri Farkli Oldugu Icin 
	// Birde Database Icinde Farkli Tablolarda Yer Alacagindan Farklý Degisken Adlari Kullanildi
	// Student Ile Ortak Degisken Kullanilmadi
	String instructorFirstName;
	String instructorLastName;
	String instructorEmail;
	
	public Instructor(int id,String instructorFirstName,String instructorLastName,String instructorEmail,String courseComment) {
		super(instructorFirstName,instructorLastName,instructorEmail,courseComment);
		
		this.instructorFirstName = instructorFirstName;
		this.instructorLastName = instructorLastName;
		this.instructorEmail = instructorEmail;
	}
}