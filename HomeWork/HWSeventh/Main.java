package by.home.HomeWork.HWSeventh;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Transmission t1 = new Transmission("avtomat" , 0);
	//	car1.transmission = t1;
		Engine e1 = new Engine(12,34,25,"desil");
		e1.engineOn();
		car1.startToMove();
		/*
		car1.starter();
		car1.startToMove();
		car1.goCar(1);
		car1.movingCar(10);
		car1.stopToMove(0);
		car1.stoper();
		car1.nextTransmission(1);
		car1.tank(15,50);
		car1.refillTank(97);
		car1.speedTransmis(3);
		*/
	}

}
