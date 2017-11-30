package by.home.lesson19;

public class Cat {
	
	
	String name;
	int age;
	int id;
	
	public Cat(String name, int age) {
		this.name= name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	public Cat(String name, int age, int id) {
		this.name= name;
		this.age = age;
		this.id = id;
	}
	public Cat() {
	}
	
}
