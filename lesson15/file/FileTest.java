package by.home.lesson15.file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		
		File f1 = new File("D:/Yaravoy/classFileTest/test.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File f2 = new File("D:/Yaravoy/classFileTest/test2.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(f1.exists());
		//f1.exists();
		System.out.println(f1.getAbsoluteFile());
		//f1.getAbsoluteFile();
		System.out.println(f1.getName());
		System.out.println(f1.getParent());
		System.out.println(f1.isHidden());
		System.out.println(f1.length());
		System.out.println(f1.lastModified());
		f1.mkdir();
		f1.renameTo(f2);
		
	}

}
