package by.home.test;

import java.util.Scanner;

public class secondLesson {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������� ����� �� 1 �� 5 ");
		int number = sc.nextInt();
		
		switch(number){
			
			case 1: {
				System.out.print("�� ����� ������� " );
				break;
			}
			case 2: {
				System.out.print("�� ����� ��� " );
				break;
			}
			case 3: {
				System.out.print("�� ����� ��� " );
				break;
			}
			case 4: {
				System.out.print("�� ����� ������ " );
				break;
			}
			case 5: {
				System.out.print("�� ����� ���� " );
				break;
			}
			default: {
				System.out.print("��� ������ ������ ��� ����� 5" );
				break;
			}
		}
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ��� ������ ������: ");
		int firsCar = sc.nextInt();
		
		System.out.print("������� ��� ������ ������: ");
		int secondCar = sc.nextInt();
		
	
		if (firsCar > secondCar) {
			
			System.out.print("������ ������ : " + firsCar + " ������" );

		} else {
			
			System.out.print("������ ������ : " + secondCar + " ������" );
		}
		
		

		boolean resault = secondCar > firsCar;
		System.out.println(resault); 
		
		boolean more = secondCar > firsCar;
		System.out.println(more); 
		
		boolean less = secondCar > firsCar;
		System.out.println(less); 
		
		boolean euqels = secondCar == firsCar;
		System.out.println(euqels);
		
		boolean noeuqels = secondCar != firsCar;
		System.out.println(noeuqels); 
		
		boolean euqelsMore = secondCar >= firsCar;
		System.out.println(euqelsMore); 
		
		boolean euqelsLess = secondCar <= firsCar;
		System.out.println(euqelsLess); 
	
		boolean compare = (firsCar < secondCar) && (firsCar < thirdCar);
		boolean youngest = (firsCar < secondCar) || (firsCar < thirdCar);
		System.out.println(compare); 
		System.out.println(youngest); 		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ����� ��: ");
		double numberPi = sc.nextDouble();
		double pi = 3.14;
		boolean resultPi = numberPi == pi;
		System.out.println("��� �����: " + resultPi ); 
		
		*/
		
		
	}

}
