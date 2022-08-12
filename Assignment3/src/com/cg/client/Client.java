package com.cg.client;

import java.sql.Connection;
import com.cg.util.DBUtil;
import com.cg.crudoperation.CrudOperation;

public class Client {

	public static void main(String[] args) throws Exception{
		Connection connection = DBUtil.getConnection();
		if(connection != null) {
			System.out.println("JDBC: Connection is established");
		}
		CrudOperation.retrieveByStudent();


	}

}
