package day3_homework_04;

public class Main {

	public static void main(String[] args) {
		
		// Class lar Ile Calismak
		FourOperations fourOperations = new FourOperations();
		System.out.println("Total :");
		int total = fourOperations.total(10, 20);
		System.out.println(total);
		System.out.println("");
		
		System.out.println("Minus :");
		int minus = fourOperations.minus(30, 10);
		System.out.println(minus);
		System.out.println("");
		
		System.out.println("Multiple :");
		int multiple = fourOperations.minus(5, 10);
		System.out.println(multiple);
		System.out.println("");
		
		System.out.println("Division :");
		int division = fourOperations.minus(30, 10);
		System.out.println(division);
	}
}