package day4_homework_06_01;

// Validar Class Kullanilmasinin Sebebi
// Urun Kaydetme Ve Guncelleme Islemlerinde
// Islemlerin Kurallara Ugun Olma Durumunu Kontrol Ediyoruz
public class ProductValidator {
	
	// Static Anahtar Kelimesi Kullanilan Fonksiyonlara 
	// Class Adi Uzerinden Ulasilabilir
	public boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}