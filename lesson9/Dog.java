package by.home.lesson9;

public class Dog extends Animal{
	
	
	private int maxCatchThief;
	

	public void catchThief(){
		System.out.println("Я ловлю воров");
	}
	
	public int getMaxCatchThief() {
		return maxCatchThief;
	}

	public void setMaxCatchThief(int maxCatchThief) {
		this.maxCatchThief = maxCatchThief;
	}
	
}
