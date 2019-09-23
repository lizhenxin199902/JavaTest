package day1;
/**
 * satement和preparestatement的使用
 * execute返回的是true 或者 false，可用来判断操作是否成功
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class sqlSelect {
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
			System.out.println("连接成功");
			
//			String sqlstr = "insert into product(prod_id,prod_name) values ('P1010','hjsa')";
//			Statement stmt = dbConn.createStatement();
//			stmt.execute(sqlstr);   **一般不用statement主要用preparestatement
			String sqlstr = "insert into product(prod_id,prod_name) values (?,?)";  //?占位符，可以防sql注入
			PreparedStatement smt = dbConn.prepareStatement(sqlstr);
//			smt.setString(1, "2017");  //Java参数索引从1开始；
//			smt.setString(2, "李");
			
			smt.setObject(1, "2010");
			smt.setObject(2, "张");
			//不限制参数类型
			System.out.println("掺入一条数据");
			smt.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("失败");
		}
	
	}
}
