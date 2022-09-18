package day3_homework_07;

public class Main {

	public static void main(String[] args) {
		
		// Getter ve Setter Ile Calismak
		Products product = new Products();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setColor("Black");
		
		ProductsManager productManager = new ProductsManager();
		productManager.add(product);
	}
}