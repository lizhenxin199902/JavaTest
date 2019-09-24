package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo2 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=student", "sa", "lzx199902");
		
			String sqlstr ="select* from StuInfo";
			PreparedStatement ps = conn.prepareStatement(sqlstr);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"---"+rs.getString(2));
			}
			
			System.out.println("success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
