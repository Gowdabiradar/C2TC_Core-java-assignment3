package com.cg.crudoperation;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.util.DBUtil;

public class CrudOperation {
	
	public static void createStudent() throws SQLException {
		Connection connection = DBUtil.getConnection();
		Statement st = connection.createStatement();
		String sqlinsert = "INSERT INTO students(SL,Name, Dept, USN, College)"+"values('1','Gourav','EEE','1AY116EE021','AIT')";
		int execute = st.executeUpdate(sqlinsert);
		if(execute==1) {
			System.out.println("entery is added");
		}
	}
		public static void retrieveByStudent() throws SQLException {
		Connection connection = DBUtil.getConnection();
		Statement st = connection.createStatement();
		String sqlretrieve ="SELECT* from students where SL=1  ";
		ResultSet rs = st.executeQuery(sqlretrieve);
		if(rs.next()) {
			int SL = rs.getInt(1);
			String Name = rs.getString(2);
			String Dept = rs.getString(3);
			String USN = rs.getString(4);			
			String College = rs.getString(5);
			
			System.out.println(SL+" "+Name+" "+" "+Dept+" "+USN+" "+" "+College);
		}
		else {
			System.out.println("Student doesn't exist with the provided Name");
		}	
	}

}