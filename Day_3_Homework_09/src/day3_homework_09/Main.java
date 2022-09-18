package day3_homework_09;

public class Main {

	public static void main(String[] args) {
		
		// Method Overloading Ile Calismak
		FourOperations fourOperations = new FourOperations();
		System.out.println(fourOperations.total(10, 30));
		System.out.println(fourOperations.total(10, 20, 30));
	}
}