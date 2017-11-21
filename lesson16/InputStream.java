package by.home.lesson16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) throws Exception {
		
		/*
		FileInputStream fis = new FileInputStream("D:/Yaravoy/classFileTest/test.txt");
		int i;
		while ((i = fis.read())!= -1){
			System.out.println((char)i);
		}
		*/
		FileOutputStream fos = new FileOutputStream("D:/Yaravoy/classFileTest/test.txt");
		String s = "text for write";
		byte[] arrayForWrite = s.getBytes();
		fos.write(arrayForWrite);
		
		
		FileWriter fw = new FileWriter("D:/Yaravoy/classFileTest/test.txt", false);
		fw.write("privet medved !!!!" + '\n');
		fw.write("ne privet medved !!!!");
		fw.flush();
		
		FileReader fr = new FileReader("D:/Yaravoy/classFileTest/test.txt");
		int e;
		while ((e = fr.read())!= -1){
			System.out.print((char)e);
		}
	}
	
		
}

