package day3_homework_06;

public class ProductsManager {
	public void add(Products product) {
		System.out.println("Product Added : " + product.name);
	}
	
	public void delete(Products product) {
		System.out.println("Product Deleted : " + product.name);
	}
	
	public void update(Products product) {
		System.out.println("Product Updated : " + product.name);
	}
}