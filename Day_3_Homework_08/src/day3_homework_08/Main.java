package day3_homework_08;

public class Main {

	public static void main(String[] args) {
		
		// Constructor Ile Calismak
		Products product = new Products(1,"Laptop","Asus Laptop",5000,3,"Black");
		
		ProductsManager productManager = new ProductsManager();
		productManager.add(product);
	}
}