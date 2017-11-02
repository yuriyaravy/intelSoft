package by.home.test;

import java.util.Scanner;

public class secondLesson {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число от 1 до 5 ");
		int number = sc.nextInt();
		
		switch(number){
			
			case 1: {
				System.out.print("Вы ввели единицу " );
				break;
			}
			case 2: {
				System.out.print("Вы ввели два " );
				break;
			}
			case 3: {
				System.out.print("Вы ввели три " );
				break;
			}
			case 4: {
				System.out.print("Вы ввели четыре " );
				break;
			}
			case 5: {
				System.out.print("Вы ввели пять " );
				break;
			}
			default: {
				System.out.print("Мой придел знание это цифра 5" );
				break;
			}
		}
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите год первой машины: ");
		int firsCar = sc.nextInt();
		
		System.out.print("Введите год второй машины: ");
		int secondCar = sc.nextInt();
		
	
		if (firsCar > secondCar) {
			
			System.out.print("первая машина : " + firsCar + " старше" );

		} else {
			
			System.out.print("Вторая машина : " + secondCar + " моложе" );
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
		System.out.print("Введите число пи: ");
		double numberPi = sc.nextDouble();
		double pi = 3.14;
		boolean resultPi = numberPi == pi;
		System.out.println("Ваш ответ: " + resultPi ); 
		
		*/
		
		
	}

}
