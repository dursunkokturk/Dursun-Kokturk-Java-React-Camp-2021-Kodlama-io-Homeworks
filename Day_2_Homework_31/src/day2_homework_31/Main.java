package day2_homework_31;

public class Main {

	public static void main(String[] args) {
		
		// Constructor Ile Calismak
		
		// Parametreli Constructor
		Product product = new Product(1,"Laptop","Asus Laptop",5000,3,"Black","L1");
		
		// Parametresiz Constructor
		/*product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		*/
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getProductCode());
	}
}