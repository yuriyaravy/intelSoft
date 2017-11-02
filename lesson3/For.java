package by.home.lesson3;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		System.out.print("¬ведите число ");
		if (sc.hasNextInt()){		
		int number = sc.nextInt();
		
		
		for (int numb = 0; numb <= number; numb++){
			
				if (numb%2 == 0) {
					System.out.println("число " + numb);
				}
			}
		
		
/*		for (int numb = number; numb > 0; numb--){
			if(numb ==3 || numb ==6){
				continue;
			}
			System.out.println("число " + numb);
	}
		} else {
		System.out.println("Ёто не число ");
		*/
}
}
}
