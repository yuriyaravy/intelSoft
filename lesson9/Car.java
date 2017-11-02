package by.home.lesson9;

public class Car {
	
		private int year;
		private int speed;
		private int maxSpeed;
		private String brend;
		private int maxTank;
		
	public Car(){
		
	}
	public Car(int year){
		this.year = year;
	}
	public Car(int year, int speed){
		this.year = year;
		this.speed = speed;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getBrend() {
		return brend;
	}
	public void setBrend(String brend) {
		this.brend = brend;
	}
	public int getMaxTank() {
		return maxTank;
	}
	public void setMaxTank(int maxTank) {
		this.maxTank = maxTank;
	}
	
}
