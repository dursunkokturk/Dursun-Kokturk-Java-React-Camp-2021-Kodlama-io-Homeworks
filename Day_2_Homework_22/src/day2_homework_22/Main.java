package day2_homework_22;

public class Main {

	public static void main(String[] args) {
		
		// Parametreli Fonksiyonlari Anlamak
		
		// Main Class Disinda Parametreli Fonksiyon Tanimlama
		// Tanimlanan Fonksiyonda Yapilacak Islemi Belirtme
		// Main Class Icinde Fonksiyonu Cagirma
		// Cagirilan Fonksiyona Parametre Gonderme
		System.out.println("Today is so Beautiful");
		
		// Total Fonksiyonu Icinde Bellirtilen Parametrelere Gore
		// Kullanicinin Girdigi Degerleri Degiskenlere Atama Yapiyoruz Ve 
		// Yapilan Islemin Sonucunu Total Degiskenine Atama Yapiyoruz
		int total = total(5,7);
		System.out.println(total);
		
		String newMessage = cityGive();
		System.out.println(newMessage);
	}
	
	public static void add() {
		System.out.println("Added");
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}
	
	public static void update() {
		System.out.println("Updated");
	}
	
	public static int total(int number1,int number2) {
		return number1 + number2;
	}
	
	public static String cityGive() {
		return "Ankara";
	}
}