package day3_homework_07;

public class ProductsManager {
	public void add(Products product) {
		System.out.println("Product Added : " + product.getName());
	}
	
	public void delete(Products product) {
		System.out.println("Product Deleted : " + product.getName());
	}
	
	public void update(Products product) {
		System.out.println("Product Updated : " + product.getName());
	}
}