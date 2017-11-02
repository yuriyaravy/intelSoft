package by.home.lesson4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

			
			int resualt = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Число ");
				boolean checkNumber = sc.hasNextInt();
				
			
			if(checkNumber){
				
				int number = sc.nextInt();
				int MathDegree = 2;
				
				resualt = number * MathDegree;
				System.out.println("Вывод " + resualt);
				
			}else{
				System.out.println("Это не число ");
			}
		}

	}


