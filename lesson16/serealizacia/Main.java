package by.home.lesson16.serealizacia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		FileOutputStream fos = new FileOutputStream("D:/Yaravoy/classFileTest/test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Car c1 = new Car(1999 , "BMW", 200);
		Car c2 = new Car(2009 , "Audi", 170);
		Car c3 = new Car(2004 , "Mersedes", 180);
		
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		
		
		//Car[] cars = {c1,c2,c3};
		
		
		oos.writeObject(cars);
		
		
		FileInputStream fis = new FileInputStream("D:/Yaravoy/classFileTest/test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/Yaravoy/classFileTest/test.txt"));
		
		ArrayList<Car> fc = (ArrayList<Car>) ois.readObject();
		for(Car car : fc){
			System.out.println(car);
		}
		
		

	}

}
