package by.home.lesson19;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Main {

	public static void main(String[] args) throws SQLException  {
	
	//	Cat c1 = new Cat("Sosiska", 3, 6);
		ArrayList<Cat> cats = new ArrayList<Cat>();

		System.out.println(CatDAO.read());
	}	
}
