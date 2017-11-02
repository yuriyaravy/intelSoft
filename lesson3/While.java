package by.home.lesson3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		int plus = 1;
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("¬ведите число ");
		if (sc.hasNextInt()){
			
			int number = sc.nextInt();
			while(plus <= number){
				System.out.println("¬ведите число " + plus);
				plus++;
			}
			plus--;
			do{
				System.out.println("¬ведите число " + plus);
				plus--;
			}
			while(plus > 0);
			
		} else {
			System.out.println("¬ведите число ");
		}
	}

}
