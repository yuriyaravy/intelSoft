package by.home.lesson6;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite deni rozdenia ");
		System.out.println("Vvedite mesiaz rozdenia ");
		System.out.println("Vvedite god rozdenia ");
		int day  = sc.nextInt();
		int month  = sc.nextInt();
		int year  = sc.nextInt();
		
		GregorianCalendar userBr = new GregorianCalendar(year,month,day);
		userBr.add(Calendar.YEAR, 18);
		GregorianCalendar checkTime = new GregorianCalendar();
		checkTime.getTime();
		
	//	boolean checkYear = dayToDay.after(userBr);
			System.out.println(userBr.before(checkTime));
			
		}
	}


