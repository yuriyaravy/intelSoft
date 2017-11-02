package by.home.lesson8;

public class TryString {

	public static void main(String[] args) {
		
		String test ="пробный текс для стринг";
		String test2 ="киткэт";
		System.out.println(test.length());
		System.out.println(test.charAt(4));
		System.out.println (test.concat("X"));
		System.out.println(test.contains("р"));
		System.out.println(test.isEmpty());
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());
		System.out.println(test.equals(test2));
		System.out.println(test.substring(21));
		System.out.println(test2.replace("к", "ч"));
		System.out.println(test.replaceFirst("о", "в"));
		System.out.println(test.split(" "));
		char[] arrsy = new test; 
		for (int i = 0; i = arrsy.leght; i ++){
			System.out.println(toString.arrsy[i]);
		}
		
	}

}
