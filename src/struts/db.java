package struts;
import java.sql.*;
public class db {
public Connection connection(){
	 Connection con=null;
	   try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   try {
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xhw?useUnicode=true&characterEncoding=utf8","root","151782ab");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
 }
}
