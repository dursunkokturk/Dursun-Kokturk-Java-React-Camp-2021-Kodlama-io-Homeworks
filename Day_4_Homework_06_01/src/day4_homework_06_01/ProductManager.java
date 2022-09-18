package day4_homework_06_01;

public class ProductManager {
	public void add(Product product) {
		
		// ProducttValidator Class Icinde Girilen Bilgilerin 
		// Kurallara Uygun Sekilde Girilme Kontrolunu Yaptiktan Sonra
		// ProductValidator Objesi Uzerinden Data Geliyor Ise
		// Ekleme Islemi Yapilacak 
		// Data Gelmiyor Ise Ekleme Islemi Yapilmayacak
		ProductValidator validator = new ProductValidator();
		
		// ProductValidator Objesi Uzerinden Girilen Bilgiler 
		// Dogru Ise Ekleme Isleminin Yapidigini Belirten Mesaj Gorunecek
		
		if (validator.isValid(product)) {
			System.out.println("Added");
		}else {
			// Girilen Bilgiler Eksik Yada Yanlis Ise Uyari Islemini Yapiyoruz
			System.out.println("Infos Invalid");
		}
	}
}