package by.home.lesson7;

public class Telefon {
	
	
	int nubmer = 0;
	boolean camera = false;

	public Telefon(){
		
	}

	public Telefon(int number){
		this.nubmer = number;
	}

	public Telefon(boolean camera){
		this.camera = camera;
	}
	
	public Telefon(int nubmer, boolean camera){
		this(nubmer);
		this.camera = camera;
	}
}