package day3_homework_14;

public class UserManager extends User{
		
	public UserManager(int id, String userName) {
		super(id, userName);
		
		// Kullanici Direkt Giris Yaptiginda 
		// Sadece Menuleri Ve Kurs Bilgilerini Goruntuleyecek
		
		// Student Olarak Giris Yaparsa 
		// Video Izleme Yorum Yapma Yaptigi Yorumu Silme Yetkisi
		
		// Instructor Olarak Giris Yaparsa 
		// Yorum Silme Kurs Ekleme Silme Kullanici Silme Yetkisi
		String userName1 = null;
		String user = null;
		String student = null;
		String instructor = null;

		
		userName1 = instructor;

		if (userName1 == user) {
			
			// Kayitli Olmayan Kullaniciya Menuler Kurs Bilgileri Gorunecek
			
			System.out.println("Course Infos and Comments");
			
			System.out.println("Log in as a Student to Watch Videos Comment");
			System.out.println("Sign in as a Instructor to Add Course And Delete Comment");
			
			
		}else if (userName1 == student) {
			System.out.println("Welcome Student");
		}else {
			System.out.println("Welcome Instructor");
		}
	}
	
}