package Bank.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.postgresql.ds.PGSimpleDataSource;







//JSP SERVLET 
public class connection1 {
	private static String driver="oracle.jdbc.OracleDriver";
	private static String url="jdbc:oracle:thin:@DESKTOP-IHHCNDI:1521:XE";
	private static String userName="System";
	private static String password="root";
	static {
		 try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public static Connection getconnection()
	 {
		 Connection conn=null;
		
		 try {
			conn=DriverManager.getConnection(url,userName,password);
			System.out.println("connection "+conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return conn;
	 }

}




