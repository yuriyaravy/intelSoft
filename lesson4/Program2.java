package by.home.lesson4;

import java.util.Scanner;

public class Program2 {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Введите число для проверки ");
		 int number = sc.nextInt();
			
	        boolean isCheek = true;
	        	        
	        for(int i=2; i<number/2 ;i++)
	        {
	            if (number%i==0) {
	            	isCheek = false;
	            	System.out.println("Простое ");
	                break;
	       }else{
	    	   
            System.out.println("Состовное");
            	break;
	        }
	     }
	 }
}

