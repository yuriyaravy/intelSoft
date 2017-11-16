package by.home.lesson15.Collection.Parametrizasia;

public class Calculator<T> {
	
	private T firstNumber;
	private T secondNumber;
	
	public Calculator(){
		
	}
	public Calculator(T fNum, T sNum){
		this.firstNumber = fNum;
		this.secondNumber= sNum;
	}
	public T getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(T firstNumber) {
		this.firstNumber = firstNumber;
	}
	public T getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(T secondNumber) {
		this.secondNumber = secondNumber;
	}
	
}


