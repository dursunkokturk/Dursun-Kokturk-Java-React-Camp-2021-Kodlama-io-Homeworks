package day4_homework_06_03;

public class Main {

	public static void main(String[] args) {
		
		// ProductValidator Class Icinde
		// Static Anahtar Kelimesini Kullanarak ProductManager Class Icinde
		// ProductValidator Objesi Olusturmaya Gerek Kalmadan
		// Girilen Bilgilerin Dogrulugunu Sorgulayabiliriz
		
		
		
		// ProductManager Objesi Uzerinden ProductManager Class i Icinde Girilen Bilgilerin 
		// Kurallara Uygun Olma Durumunu Kontrol Ediyoruz
		ProductManager productManager = new ProductManager();
		
		
		// Product Objesi Uzerinden Urun Bilgilerini Giriyoruz
		Product product = new Product();
		product.name = "Mouse";
		product.price = 10;
		
		// Bilgileri Girilen Urunu Yazdiriyoruz
		productManager.add(product);
	}
}