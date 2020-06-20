package com.learn.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestClass {
	 public static void main(String[] args) throws SQLException,ClassNotFoundException {
	        String url = "jdbc:oracle:thin:@localhost:1521:xe";
	        String user = "scott";
	        String password = "tiger";
	        Connection connection = null;

	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        connection = DriverManager.getConnection(url, user, password);
	        if(connection!=null){
	            System.out.println("Success in connnection");
	        } else {
	            System.out.println("failure in connection ");
	        }
	    }
}
