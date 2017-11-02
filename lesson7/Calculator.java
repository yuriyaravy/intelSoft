package by.home.lesson7;

public class Calculator {
	
	public static int plus(int firstNumber,  int SecondNumber){
		int sum = firstNumber + SecondNumber;
			return sum;
	}
	public static int plus(int firstNumber,  int SecondNumber, int thierdNumber ){
		int sum = firstNumber + SecondNumber;
			return sum;
	}
		
	
	public static int plus(int[] arrays){
		int sum=0;
		for(int i = 0; i < arrays.length; i++){
			arrays[i] = (int) (Math.random());
			sum = sum + arrays[i];
		}
		return sum;
	}
	public static int plus(Integer...arrays){
		int sum=0;
		for(int i = 0; i < arrays.length; i++){
			sum = sum + arrays[i];
		}
		return sum;
	}
	public static final double pi = 3.14;
	
	public static double area(double radius){
		final double pi = 3.14;
		double resalt = 0;
		resalt = pi + (radius *2);
		return resalt;
	}
	
	
	public static  int 	minus(int firstNumber,  int SecondNumber){
		int sum = firstNumber - SecondNumber;
			return sum;
	}
	public static int multiply(int firstNumber,  int SecondNumber){
		int sum = firstNumber * SecondNumber;
			return sum;
	}
	public static int divide(int firstNumber,  int SecondNumber){
		int sum = firstNumber / SecondNumber;
			return sum;
	}
	

}
