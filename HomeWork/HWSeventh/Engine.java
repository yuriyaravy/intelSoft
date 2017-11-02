package by.home.HomeWork.HWSeventh;

public class Engine {
		
	int volumeEngine;
	int numberEngine; 
	int powerEngine; 
	String petrolType;
	boolean actEngine;
	
	public Engine(int volumeEngine,int numberEngine, int powerEngine,String petrolType){
		this.volumeEngine = volumeEngine;
		this.numberEngine = numberEngine;
		this.powerEngine = powerEngine;
		this.petrolType = petrolType;
	}
	public boolean engineOn(){
		actEngine = true;
		return actEngine;
	}
	public boolean engineOff(){
		actEngine = false;
		return actEngine;
	}
	
}
