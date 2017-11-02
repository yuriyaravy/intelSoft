package by.home.lesson5;

public class Choice {

	public static void main(String[] args) {
		
		int arrays [] = {3,4,52,7,6,5,8,9,12};
		int min = 0;
		for(int i = 0; i < 9; i++){
			min = i;
			for(int j = i + 1; j < 9; j++){
				if (arrays[min] > arrays[j]){
					min = j;
				}
			}
			
			int temp = arrays[i];
			arrays[i] = arrays[min];
			arrays[min] = temp;
       }
		for(int a = 8; a > 0; a--){
			System.out.println(arrays[a]);
		}
}
}//выборка массива 