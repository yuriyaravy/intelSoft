package by.home.lesson16.serealizacia;

import java.io.Serializable;

public class Car implements Serializable{
	
	private int year;
	private String model;
	private int power;
	
	public Car(){}
	
	public Car(int year, String model, int power){
		this.model = model;
		this.year = year;
		this.power = power;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", model=" + model + ", power=" + power + "]";
	}
	

}
