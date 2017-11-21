package by.home.lesson16;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TextProgran  {

	public static void main(String[] args) throws Exception {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Pls write way to file");
		String way = sc.nextLine();
		File file = new File(way);
		if(file.exists()){
			FileWriter fw = new FileWriter(way, true);
			System.out.println("What do you want write");
			String newText = sc.nextLine();
			fw.write(newText + '\n');
			fw.flush();
		}else{
			System.out.println("Не существует !!!");
		}
	}
}
