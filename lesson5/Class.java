package by.home.lesson5;
import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite radiys");
		int arrSize = sc.nextInt();
		
		double[] arrays = new double [arrSize];  
		Random r = new Random();
		for (int i = 0; i < arrSize; i++){
			arrays[i] =r.nextDouble();
				System.out.println(arrays[i]);
			
		}
		
		
		

	}

}
