package com.pluralsight.creationalpatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

//	private static DbSingleton instance = new DbSingleton();   // Eagerly loaded, not a good way for performance, so we need to lazily load it
	private static volatile DbSingleton instance = null;
	private Connection conn = null;

	private DbSingleton (){
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public static synchronized DbSingleton getInstance() { synchronized every time, slow it down.
	public static DbSingleton getInstance() {

		if (instance == null) {		// make sure to go to synchronized only the first time
			synchronized (DbSingleton.class) {
				if (instance == null) {				// make sure there is no race condition
					instance = new DbSingleton();
				}
			}
		}
		
		return instance;
	}
	
	public Connection getConnection() {
		if(conn == null) {
			synchronized (DbSingleton.class) {
				if(conn == null) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						
						conn = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return conn;
	}
}
