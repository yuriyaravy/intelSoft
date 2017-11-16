package by.home.lesson15.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collect {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0, 19);
		al.add(1, 149);
		al.add(2, 129);
		al.add(3, 169);
		al.add(4, 194);
		al.add(5, 19);
		al.add(6, 49);
	//	ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		Collections.sort(al);
			for(Object q : al){
				System.out.println(al);
			}
		Collections.reverse(al);
			for(Object q : al){
				System.out.println(al);
			}
			System.out.println(Collections.min(al));
			System.out.println(Collections.max(al));
			Collections.shuffle(al);
			
			for(Object q : al){
				System.out.println(al);
			}
			

	}
}
