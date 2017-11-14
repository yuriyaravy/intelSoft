package by.home.lesson14.ArrayList;

import java.util.HashSet;

public class RandNumb {

	
	public static int setRandom(){
		int randomNum = (int)Math.random() * 1000;
			return randomNum;
	}
		private static int randomNum;
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(randomNum);
		
		System.out.println(hs);
		
	}	
	

}
