package by.home.lesson9;

public abstract class Animal {
	
	protected String name;
	private String breed;
	private int weight;
	private int age;
	
		boolean action;
	public boolean moveOn(){
		System.out.println("я хожу");
		return action = true;
	}
	public boolean moveOff(){
		System.out.println("я не хожу");
		return action = true;
	}
			boolean noize;
	public boolean soundOn(){
			System.out.println("я издою звук м€у !! м€у!!");
			return noize = true;
	}
	public boolean soundeOff(){
		System.out.println("я не издою звук");
		return noize = true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
	