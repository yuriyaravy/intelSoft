package by.home.lesson12;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Transmission t1 = new Transmission();
		t1.transmissionType = "avtomat";
		
		Car c1 = new Car();
		c1.model = "audi";
		c1.transmission = t1;
		System.out.println(t1);
		System.out.println(c1);
		Car c2 = (Car) c1.clone();
		System.out.println(c2);
		c1.model ="bmw";
		System.out.println("first " +c1);
		System.out.println("Second " +c2);
		c1.transmission.transmissionType = "mex";
		System.out.println("first " +c1);
		System.out.println("Second " +c2);
		System.out.println(c1.transmission == c2.transmission);
		Car c3 = new Car (c1);
		System.out.println("thierd " + c3);
		c1.transmission.transmissionType = "avto";
		System.out.println("first " +c1);
		System.out.println("thierd " +c3);
		
		Car.Door door = c1.new Door();
		door.isOpenDoor();
		
	//	Car.Door door = new Car.Door();
	//	door.isOpen = true;
	//	cdw.isOpen= true;
	//	System.out.print(door);
		
		
		
		

	}
}
