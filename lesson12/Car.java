package by.home.lesson12;

public class Car implements Cloneable{
	
	String model;
	Transmission transmission;
	boolean isOpen = false;
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", transmission=" + transmission.transmissionType + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	Car(){}
	
	Car(Car car){
		this.model = car.model;
		this.transmission = new Transmission(car.transmission);
	}
	
	public class Door{
		public void isOpenDoor(){
		boolean isOpen = true;
		}
		@Override
		public String toString() {
			return "Door [isOpen=" + isOpen + "]";
		}
	}
	
	
	
}
