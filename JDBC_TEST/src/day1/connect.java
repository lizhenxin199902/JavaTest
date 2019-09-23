package day1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import com.sun.xml.internal.fastinfoset.sax.Properties;


public class connect {
	public static void main(String[] args) {
		String driverName= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=company";
		String userName="sa";
		String userPwd="lzx199902";
		try {
			Class.forName(driverName);
			long start = System.currentTimeMillis();
			System.out.println("");
			@SuppressWarnings("unused")
			Connection dbConn = DriverManager.getConnection(dbURL,userName,userPwd);
			long end = System.currentTimeMillis();
			System.out.println(end-start);
			System.out.println("³É¹¦");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Ê§°Ü");
		}
	}
}
//public Connection getConnection() throws Exception{
//	String driverClass = null;
//	String jdbcUrl= null;
//	String user = null;
//	String password = null;
//	
//	Driver driver = (Driver) Class.forName(driverClass).newInstance();	
//	Properties info = new Properties();
//	
//
//	return null;
//}
//}
