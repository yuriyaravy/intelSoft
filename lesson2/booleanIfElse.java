package by.home.lesson2;

import java.util.Scanner;

public class booleanIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������� ������������� ����� ");
		boolean number = sc.hasNextDouble();
		
		if (number){
			
			System.out.print("������������� ����� ");
			
		} else {
			
			System.out.print("��� �� ������������� ����� ");
			
		}
	}

}
