package by.home.OOP;

import java.util.GregorianCalendar;

public class Car {
	
	private int maxSpeed = 200;
	int power = 100 ;
	GregorianCalendar createdDate = new GregorianCalendar();
	String color;
	String brand;
	boolean isRunCar;
	int transmission = 0;
	
	public void carGo(int maxSpeed){
		if (isRunCar){
			System.out.println(" Машина едет " + maxSpeed );
		}else{
			System.out.println("Заведите машину");
		}
	}
	public void Starter(){
		isRunCar = true;
		
	}
	public void StopCar(){
		isRunCar = false;
		
	}
	public int nextTransmission(){
		transmission++;
		return transmission;
	}
	public int lowTransmission(){
		transmission--;
		return transmission;
	}
}
