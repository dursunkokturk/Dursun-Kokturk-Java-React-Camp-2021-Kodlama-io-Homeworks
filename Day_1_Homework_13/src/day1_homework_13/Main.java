package day1_homework_13;

public class Main {

	public static void main(String[] args) {
		// String ler Ile Calismak
		String message = "Bug�n Hava �ok G�zel";
		System.out.println(message);
		System.out.println("");
		
		System.out.println("Total Character Numbers: " + message.length());
		System.out.println("");
		
		System.out.println("5 th Character: " + message.charAt(4));
		System.out.println("");
		
		// concat Fonksiyonunu Tekrar Kullan�rken Ayn� Kodlar� Tekrarlamay� �nlemek ��in 
		// De�i�kene Atamak Gerekiyor
		System.out.println("Yaz�ya Ekleme Yap�lm�� Hali : " + message.concat(" Ya�as�n!"));
		System.out.println("");
		
		// startsWith Fonksiyonunu Degisken Icindeki Yazinin 
		// Ilk Kelimesinin Ilk Karakterinin Belirtilen Karakter 
		// Olma Durumunu Sorgulamak Icin Kullanilir
		System.out.println("Yaz�daki �lk Karakter : " + message.startsWith("B"));
		System.out.println("");
		
		// endsWith Fonksiyonunu Degisken Icindeki Yazinin 
		// Son Karakterinin Belirtilen Karakter 
		// Olma Durumunu Sorgulamak Icin Kullanilir
		System.out.println("Yaz�daki Son Karakter : " + message.endsWith("."));
		System.out.println("");
		
		// Bir Cumle Icindeki Karakterin Istenildigi Kadar ki Kismini 
		// index Numaralari Uzerinden
		// �stenilen Karakterden Ba�layarak 
		// Bir Degiskene Atama Yapiyoruz.
		char[] characters = new char[5];
		message.getChars(0, 4, characters, 0);
		System.out.println("Yaz�dan Aktar�lan Karakterler: " + characters);
		System.out.println("");
		
		// Bir Cumle Icinde Bastan Aramaya Ba�layarak 
		// Bir Karakterin index Numarasini Ogrenme 
		// Ayni Karakterden Kac Tane Olduguna Bakmaz
		// Sadece Ilk Buldugu Karakterin index Numarasini Verir
		System.out.println("Yaz�daki Aranan A Karakterinin index Numaras�: " + message.indexOf("a"));
		System.out.println("");
		
		// Bir Cumle Icinde Bastan Aramaya Baslayarak 
		// Bir Karakterin index Numarasini Ogrenme 
		// Ayni Karakterden Ka� Tane Olduguna Bakmaz
		// Sadece Ilk Buldugu Karakterin index Numarasini Verir
		System.out.println("Yaz�daki Aranan E Karakterinin index Numaras�: " + message.lastIndexOf("e"));
	
	}
}