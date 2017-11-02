package by.home.lesson4;

public class Massiv {

	public static void main(String[] args) {
		
		int counter = 0;
		int sum_fib = 0;
		int fib1 = 0;
		int fib2 = 1;
		int sumOfMassiv = 0;
		
		int [] firstTrye = new int [10];
		
		while (counter < 10){
			
			firstTrye[counter]=sum_fib;
			
			 sum_fib =  fib1;
	         fib1 += fib2;
	         fib2 = sum_fib;
	         sumOfMassiv = sumOfMassiv + firstTrye[counter];
	         counter++;

		}
		System.out.println(firstTrye);
	}
}


