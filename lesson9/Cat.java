package by.home.lesson9;

public class Cat extends Animal{
	
	private String name;
	private int maxCatchMouse;
	
	public Cat (String name){	
		super.name=name;
	}
	
	public void CatchMouse(){
		System.out.println("����� �����");
	}	
	
		boolean noize;
	public boolean soundOn(){
			System.out.println("� ������");
			return noize = true;
	}
	public boolean soundeOff(){
		System.out.println("� ������");
		return noize = true;
	}
	
	public int getMaxCatchMouse() {
		return maxCatchMouse;
	}
	public void setMaxCatchMouse(int maxCatchMouse) {
		this.maxCatchMouse = maxCatchMouse;
	}
}
