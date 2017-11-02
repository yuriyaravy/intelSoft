package by.home.HomeWork.HWSeventh;

public class Car {
		

		Engine engine;
		boolean startEngine;
		Transmission transmission;
		int plateNumber;
		Tank tank ;
		BodyCar bodyCar;
		String brand;
		String color;
		int speed;
	/*
	public Car(boolean Engine,boolean startEngine,String color){
		this.boolean engine = engine;
		this.boolean startEngine;
		this.int transmission;
		this.int plateNumber;
		this.Tank = Tank;
		this.String bodyCar;
		this.String brand;
		this.color = color;
	
	}
	*/
		
		String transmissionType;
		int transmissionNumber;
		
		int petrolContainsTank;
		int maxVolumeTank;
		
	public void tank(int petrolContainsTank, int maxVolumeTank){
		this.petrolContainsTank = petrolContainsTank;
		this.maxVolumeTank = maxVolumeTank;
		
		System.out.println("In your tank contains " + petrolContainsTank + ""
				+ "	but it cant contains more then " + maxVolumeTank);
	}	
		int allpetrol;
	public void refillTank(int petrol){
		this.allpetrol = petrolContainsTank + petrol;
		if(allpetrol > maxVolumeTank){
			System.out.println("You cant contain not more then " + maxVolumeTank);
		}else{
			System.out.println("Yout tank contain  " + Math.addExact(petrolContainsTank, petrol));
		}
	}
	/*
	public void bodyCar(String bodyType, int plateNumber){
		
	}
	
	public void engine(int volumeEngine,int numberEngine, int powerEngine, 
			String petrolType){
		
	}
	*/
	public void startToMove(){
		if(Engine.actEngine ){
			System.out.println("We ready to move ");
		}else{
			System.out.println("Something wrong!!!");
		}
	}
	/*
	public void starter(){
		this.engine.start();
	}
	public void stoper(){
		this.engine.actEngine = false;
	}
	*/
	public void goCar(int transmissionNumber){
			this.transmissionNumber = transmissionNumber;
				if(engine.actEngine && transmissionNumber > 0){
					System.out.println("It's alive");
				}else{
					System.out.println("Doesn't work");
				}
			}
	
	public void movingCar(int speed){
		if(speed ==0){
			this.speed = speed;
			System.out.println("We are stopped");
		}else{
			System.out.println("Your speed " +speed);
		}
	}
	public void stopToMove(int speed){
		if(engine.actEngine == true && speed > 0){
			System.out.println("We can`t stop, we are moving " +speed+" km");
		}if(speed ==0){
			System.out.println("We can switch off the engine, we are not moving");
		}
	}
	/*
	public void transmission(String transmissionType, int transmissionNumber){
		this.transmissionNumber = transmissionNumber;
		this.transmissionType = transmissionType;
	}
	*/
	public void nextTransmission(int newtransmission ){
		transmissionNumber = newtransmission;
		if(speed == 0){
			transmissionNumber++;
			return;
		//kak dati vibor
		}if(speed > 0){
			transmissionNumber++;
			return;
		}if(speed > 0){
			transmissionNumber += 2;
			return;
		}if(newtransmission > 2){
			System.out.println("We can change only + 2");
		}
	}
		int maxSpeed = 200;
		int step = 40;
	public void speedTransmis(int transmission){
		
		int resault=step*transmission;
		switch(transmission){
			
		case 1:
			System.out.println("Max speed " + resault);
			break;
		case 2:
			System.out.println("Max speed " + resault);
			break;
		case 3:
			System.out.println("Max speed " + resault);
			break;
		case 4:
			System.out.println("Max speed " + resault);
			break;
		case 5:
			System.out.println("Max speed " + resault);
			break;
		}
	}
}
