package com.campushaat.rangerapp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionHandler {

	public static Connection getConnection() throws Exception {
		
		try
		{
			String connectionURL = "jdbc:mysql://mysql-mumbai-campushaat.cohdp50bvpva.ap-south-1.rds.amazonaws.com:3306/"+ Constants.mysqlDBName;
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "admin", "ye to galat h");
			return connection;
		}
		catch (SQLException e)
		{
			throw e;
		}
		catch (Exception e)
		{
			throw e;
		}
	}
}
