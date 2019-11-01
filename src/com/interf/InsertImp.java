package com.interf;
import model.User;
import java.sql.*;
import struts.db;
public class InsertImp extends db implements Insert {
     Connection conn;
     PreparedStatement pstmt;
     private int i;
	@Override
	public int adduser(User u) {
		// TODO Auto-generated method stub
		conn=this.connection();
		String sql="insert into user values('"+u.getName()+"','"+u.getPassword()+"') ";
		try {
			pstmt=conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        try {
				i=pstmt.executeUpdate()	;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return i;
	}

}
