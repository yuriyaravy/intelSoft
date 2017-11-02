package by.home.lesson12;

public class Transmission {
	
	String transmissionType;
	
	public Transmission(){}
	
	Transmission(Transmission transmission){
		this.transmissionType = transmission.transmissionType;
		
	}

	@Override
	public String toString() {
		return "Transmission [transmissionType=" + transmissionType + "]";
	}

}
