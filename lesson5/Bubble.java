package by.home.lesson5;

public class Bubble {

	public static void main(String[] args) {
		
		int arrays [] = {3,4,52,7,6,5,8,9,12,23};
			for(int i = 0; i < 10; i ++){
				for(int j = 0; j < 10-i-1; j++){
					if(arrays[j]> arrays[j + 1]){
					
					int t =arrays[j];
					arrays[j] = arrays [j+1];
					arrays[j + 1] = t;
					}
				}
			}
			for(int a = 0; a < 10; a++){
				System.out.println(arrays[a]);
			}
			
	}
}
