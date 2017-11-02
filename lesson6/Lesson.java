package by.home.lesson6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lesson {

	public static void main(String[] args) {

		Date d1 = new Date();
			System.out.println(d1);
			
		Date data2 = new Date(3156000);
		System.out.println("Data today --- " + data2);
		
//		data.getTime(); 
//		System.out.println(data);
		
		boolean d3 = d1.after(data2);
		System.out.println(d3);
		
		int exam = d1.compareTo(data2);
			System.out.println(exam);
			
			SimpleDateFormat dF = new SimpleDateFormat("YY-MM это день -dd");
			System.out.println(dF.format(d1));
	}

}
