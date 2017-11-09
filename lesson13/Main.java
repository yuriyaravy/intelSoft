package by.home.lesson13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try{
		int a = enterIntegerNumber();
		double b = enterDoubleNumber();
		
		int s =  a/0;
		
		System.out.println(a);
		System.out.println(b);
		}catch(EnterException e){
//			System.out.println(e.getMessage());
			System.err.println(e.getMessage());
		}catch(ArithmeticException d){
			System.err.println(d.getMessage());
		}catch(Exception e){
			System.err.println(e.getMessage()+" System error");
		}
	}
		private static int numb;
		private static double numb2;
		
		public static int enterIntegerNumber() throws EnterException{
			Scanner sc = new Scanner(System.in);
			System.out.print("¬ведите целое число ");
			if(sc.hasNextInt()){
				return numb = sc.nextInt();
			}else{
				throw new EnterException ("ќшибка !!! введите целое число");
			}
		}
		public static double enterDoubleNumber() throws EnterException{
				Scanner sc = new Scanner(System.in);
				System.out.print("¬ведите дробное число ");
				if(sc.hasNextDouble()){
					return numb2 = sc.nextDouble();
				}else{
					throw new EnterException ("¬ведите дробное число");
				}
		}
}
