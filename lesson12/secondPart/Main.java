package by.home.lesson12.secondPart;

public class Main {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setModel("audi");
		c1.go();
		
		Car c2 = new Car(){
			
			public void go(){
				System.out.println("I'm moving very fast "); 
			}
		};
		c2.go();
		System.out.println(c1.getModel()); 
		try{
		int a = 10;
		int sum = a / 2;
		}catch(ArithmeticException ae){
			System.out.print(ae + "division by zero");
		}finaly{
		System.out.print(sum);
	}
	}
}

