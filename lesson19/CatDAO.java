package by.home.lesson19;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class CatDAO {
	
	public static void inser(Cat cat) throws SQLException{
		Connection dtbCon = dataBaseManager.getDBConnection();
		String query = "insert into cats (name, age)"+
				" values('"+cat.name+"', " +cat.age+ ");";
		Statement statement = null;
		try {
			statement = (Statement)dtbCon.createStatement();
			statement.execute(query);
		} catch (SQLException e) {
			System.out.println("WE can't create new tabel");
		}finally{
			if(statement != null){
				statement.close();
			}
			if(dtbCon != null){
				dtbCon.close();
			}
		}
	}
	
	public static void update(Cat cat) throws SQLException{
		Connection dtbCon = dataBaseManager.getDBConnection();
		String query = "update cats set name = '"+cat.name+"', age = "+cat.age+" where id = "+cat.id+";";
		System.out.println(query);
		
		Statement statement = null;
		try {
			statement = (Statement)dtbCon.createStatement();
			statement.execute(query);
		} catch (SQLException e) {
			System.out.println("WE can't create new tabel");
		}finally{
			if(statement != null){
				statement.close();
			}
			if(dtbCon != null){
				dtbCon.close();
			}
		}
		
	}
	
	public static void delete(Cat cat) throws SQLException{
		Connection dtbCon = dataBaseManager.getDBConnection();
		String query = "delete from cats where id = "+cat.id+";";
		System.out.println(query);
		
		Statement statement = null;
		try {
			statement = (Statement)dtbCon.createStatement();
			statement.execute(query);
		} catch (SQLException e) {
			System.out.println("WE can't create new tabel");
		}finally{
			if(statement != null){
				statement.close();
			}
			if(dtbCon != null){
				dtbCon.close();
			}
		}
		
	}
	
	public static ArrayList<Cat> read() throws SQLException{
		Connection dtbCon = dataBaseManager.getDBConnection();
		String query = "select * from cats";
		Statement statement = null;
		ArrayList<Cat> cats = new ArrayList<Cat>();
		try {
			statement = (Statement)dtbCon.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()){ 
				Cat c = new Cat();
				c.name = rs.getString("name");
				c.age = rs.getInt("age");
				c.id = rs.getInt("id");
				cats.add(c);
			}
		} catch (SQLException e) {
			System.out.println("WE can't create new tabel");
		}finally{
			if(statement != null){
				statement.close();
			}
			if(dtbCon != null){
				dtbCon.close();
			}
		}
		return cats;
	}
}
