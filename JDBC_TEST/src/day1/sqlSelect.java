package day1;
/**
 * satement��preparestatement��ʹ��
 * execute���ص���true ���� false���������жϲ����Ƿ�ɹ�
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
			System.out.println("���ӳɹ�");
			
//			String sqlstr = "insert into product(prod_id,prod_name) values ('P1010','hjsa')";
//			Statement stmt = dbConn.createStatement();
//			stmt.execute(sqlstr);   **һ�㲻��statement��Ҫ��preparestatement
			String sqlstr = "insert into product(prod_id,prod_name) values (?,?)";  //?ռλ�������Է�sqlע��
			PreparedStatement smt = dbConn.prepareStatement(sqlstr);
//			smt.setString(1, "2017");  //Java����������1��ʼ��
//			smt.setString(2, "��");
			
			smt.setObject(1, "2010");
			smt.setObject(2, "��");
			//�����Ʋ�������
			System.out.println("����һ������");
			smt.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("ʧ��");
		}
	
	}
}
