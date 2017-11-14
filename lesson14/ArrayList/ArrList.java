
package by.home.lesson14.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrList {

	public static void main(String[] args) {
		/*
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0, 19);
		al.add(1, 149);
		al.add(2, 129);
		al.add(3, 169);
		al.add(4, 194);
		al.add(5, 19);
		al.add(6, 49);
		al.add(7, 29);
		Integer[] array = {1,3,5};
		System.out.println(Arrays.toString(array));
		al.addAll(8, Arrays.asList(array));
		System.out.println(al.get(5));
		System.out.println(al.indexOf(5));
		System.out.println(al.lastIndexOf(29));
		System.out.println(al.remove(2));
		System.out.println(al.set(2, 999));
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		List<Integer> a = al.subList(3, 6);
		System.out.println(al);
		*/
		HashSet <Dog> hs = new HashSet<Dog>(); 
		Dog d1 = new Dog("buble");
		Dog d2 = new Dog("rex");
		Dog d3 = new Dog("meet");
		
		
//		hs.add(new Dog("buble"));
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d1);
		ArrayList<Dog> dogColect = new ArrayList<Dog>();
		Dog d4 = new Dog("Lord");
		Dog d5 = new Dog("Red");
		dogColect.add(d4);
		dogColect.add(d5);
		hs.addAll(dogColect);
		System.out.println(hs);
		hs.remove(d5);
		System.out.println(hs.contains(d3));
		System.out.println(hs.isEmpty());
		System.out.println(hs.removeAll(dogColect));
		System.out.println(hs.size());
	//	System.out.println(hs);
		Object [] array = hs.toArray();
	//	System.out.println(hs.toArray());
		int[]z = {3,4,5};
		System.out.println(Arrays.toString(array));
		
		HashSet
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		

	}

	private static Dog Dog(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
