package day4_homework_06_02;

public class ProductManager {
	public void add(Product product) {
		
		// Class lar Statik Yapilmaz
		// Class lar Statik Yapilirsa Yapilan Islem Durdurulana Kadar Bellekte Kalir,
		// Class lar Icindeki Islemler Static Yapilabilir
		
		// ProductValidator Objesi Uzerinden Girilen Bilgiler 
		// Dogru Ise Ekleme Islemini 
		// Yanlis Ise Uyari Islemini Yapiyoruz
		if (ProductValidator.isValid(product)) {
			System.out.println("Added");
		}else {
			System.out.println("Infos Invalid");
		}
		
		// Parametresiz Constructor New Anahtar Kelimesi Kullanilarak
		// Olusturulan Obje Olmasi Durumunda Calisir
		ProductValidator productValidator = new ProductValidator();
		productValidator.someThing();
	}
}