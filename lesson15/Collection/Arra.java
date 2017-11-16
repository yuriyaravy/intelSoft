package by.home.lesson15.Collection;

import java.util.Arrays;

public class Arra {

	public static void main(String[] args) {
		
		int[] newAr = new int[15];
		int[] testArrays = {14,23,34,1,65,56,45,23};
		
		Arrays.sort(testArrays);
		System.out.println(Arrays.toString(testArrays));
		
		Arrays.fill(testArrays, 3, 5, 96);
		System.out.println(Arrays.toString(testArrays));
//		Arrays.asList(testArrays);
		
		int [] testArraEqu = {14,23,34,1,65,56,45,23};
		
		int copy1 = 777; 
		
		System.out.println(Arrays.equals(testArrays, testArraEqu));
		Arrays.copyOf(newAr, copy1);
		System.out.println(Arrays.toString(newAr));
		System.out.println(Arrays.toString(testArrays));
		System.out.println(Arrays.binarySearch(testArrays, 96));
		
		int[] newA = Arrays.copyOf(testArraEqu, 5);
		System.out.println(Arrays.toString(newA));
		int [] newB = Arrays.copyOfRange(testArraEqu, 1, 7);
		System.out.println(Arrays.toString(newB));
		
		
		Dog d1 = new Dog("пых");
		Dog d2 = new Dog("чых");
		Dog d3 = new Dog("вых");
		Dog d4 = new Dog("бых");
		
		Object [][] dogs = {{d1,d2},{d3,d4}};
		System.out.println(Arrays.toString(dogs));
		System.out.println(Arrays.deepToString(dogs));
		
		
		int [][] arra2 = {{12,34,45,56}, {45,2,56,305,345}};
		System.out.println(Arrays.toString(arra2));
		System.out.println(Arrays.deepToString(arra2));
		
		
		
		
	}

}
