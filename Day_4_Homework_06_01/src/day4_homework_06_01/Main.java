package day4_homework_06_01;

public class Main {

	public static void main(String[] args) {
		
		// Composition
		
		// ProductManager Class Icinde Olusturulan ProductValidator Objesi Uzerinden
		// Urun Bilgilerini Kontrol Edip Yazdirma
		
		// ProductManager Objesi Uzerinden ProductManager Class i Icinde Girilen Bilgilerin 
		// Kurallara Uygun Olma Durumunu Kontrol Ediyoruz
		ProductManager productManager = new ProductManager();
		
		// Product Objesi Uzerinden Urun Bilgilerini Giriyoruz
		Product product = new Product();
		product.name = "Mouse";
		product.price = 10;
		
		// Bilgileri Girilen Urunu 
		// Eksik Bilgi Girisi Yok Ise Yazdiriyoruz
		productManager.add(product);
	}
}