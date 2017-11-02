package by.home.lesson6;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class PartN {

	public static void main(String[] args) {
		
		GregorianCalendar gC = new GregorianCalendar();
			System.out.println(gC);
			
			GregorianCalendar gCe = new GregorianCalendar(1994,5,12);
				System.out.println(gCe);
			
				System.out.println(gCe.getTime());
				
				System.out.println(gC.getTime());
				
				System.out.println(gC.get(Calendar.HOUR));
				
				gC.add(Calendar.DAY_OF_MONTH,3);
					System.out.println(gC.getTime());
				
				
				
				
	}

}
