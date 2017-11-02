package by.home.lesson2;

import java.util.Scanner;

public class booleanIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите целочисленное число ");
		boolean number = sc.hasNextDouble();
		
		if (number){
			
			System.out.print("Целочисленное число ");
			
		} else {
			
			System.out.print("Это не целочисленное число ");
			
		}
	}

}
