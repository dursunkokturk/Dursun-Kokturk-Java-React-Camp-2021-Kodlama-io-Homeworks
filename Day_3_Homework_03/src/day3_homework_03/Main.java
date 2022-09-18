package day3_homework_03;

public class Main {

	public static void main(String[] args) {
		
		// Deger ve Referans Tipleri Anlamak
		int number1 = 10;
		int number2 = 20;
		
		number2 = number1;
		number1 = 30;
		
		// nunber2 DEgiskeninin Son Degeri Ne Olur
		System.out.println(number2);
		
		System.out.println("");
		
		int[] number3 = {1,2,3};
		int[] number4 = {4,5,6};
		
		number3 = number4;
		number3[0] = 10;
		
		// nunber2 DEgiskeninin Son Degeri Ne Olur
		System.out.println(number3[0]);
	}
}