package day1_homework_14;

public class Main {

	public static void main(String[] args) {
		// String ler Ile Calismak
		String message = "   Bug�n Hava �ok G�zel";
		System.out.println(message);
		System.out.println("");
				
		// Cumle Icindeki Bir Karakterin Yerine 
		// Baska Bir Karakter Koyma
		// Yazinin Bu Sekilde Duzenlenmis Halini Degiskene Atama Yaparsak 
		// Ayni Kodlari Tekrar Yazmaya Gerek Kalmaz
		System.out.println("C�mle ��ine - Karakteri Koyulmu� Hali:");
		System.out.println(message.replace(" ", "-"));
		System.out.println("");
		
		// Cumle Icindeki Karakterin Belirtilen Index Numarasindan Itibaren 
		// Karakterleri Almak Icin Kullaniyoruz.
		System.out.println("C�mle ��ine Belirtilen Karakterden Sonras�n�n Al�nm�� Hali: ");
		System.out.println(message.substring(4));
		System.out.println("");
		
		// Cumle Icindeki Belirtilen Iki Index Numarasi Arasinda Kalan Karakteri
		// Almak Icin Kullaniyoruz.
		System.out.println("�ki �ndex Numaras� Aras�nda Kalan Karakterin Al�nm�� Hali: ");
		System.out.println(message.substring(4,8));
		System.out.println("");
		
		// Cumle Icindeki Kelimeleri Belirtilen Belirtilen Duruma Gore
		// Ayirarak Array Tipinde Yazdiriyoruz
		System.out.println("Belirtilen Bir Duruman G�re Karakterin Array Tipinde Yaz�lm�� Hali: ");
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		System.out.println("");
		
		// Cumle Icindeki Karakterin Hepsinin Kucuk Harf Ile Yazdiriyoruz
		System.out.println("C�mle ��indeki Karakterin Hepsinin K���k Harf �le Yaz�lm�� Hali: ");
		System.out.println(message);
		System.out.println(message.toLowerCase());
		System.out.println("");
		
		System.out.println("");
		
		// Cumle Icindeki Karakterin Hepsinin Buyuk Harf Ile Yazdiriyoruz
		System.out.println("C�mle ��indeki Karakterin Hepsinin B�y�k Harf �le Yaz�lm�� Hali: ");
		System.out.println(message);
		System.out.println(message.toUpperCase());
		System.out.println("");
		
		System.out.println("");
		
		//Cumlenin Basindaki Ve Sonundaki Bosluk Karakterlerinin Hepsinin Silinmesi
		System.out.println("C�mlenin Ba��ndaki Ve Sonundaki Bo�luk Karakterlerinin Hepsinin Silinmi� Hali: ");
		System.out.println(message);
		System.out.println(message.trim());
		System.out.println("");
	}
}