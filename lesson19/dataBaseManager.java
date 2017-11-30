package by.home.lesson19;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class dataBaseManager {
	
	public static Connection getDBConnection(){
		Connection bdConnection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			bdConnection = (Connection)DriverManager.getConnection("jdbc:mysql://localHost:3306/bank","root","password");
		} catch (ClassNotFoundException e) {
			System.out.println("you can't registered ");
		} catch(SQLException e ){
			System.out.println("error problem with connection");
		}
		return bdConnection;
	}

}
