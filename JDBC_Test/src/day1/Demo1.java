package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库连接
 * @author me
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://localhost:1433;DatabaseName=student";
		String user = "sa";
		String password = "lzx199902";
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println("连接成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接失败");
			e.printStackTrace();
		}
		
	}

}

