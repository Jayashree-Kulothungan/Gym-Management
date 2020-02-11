package util;

import java.sql.*;
import java.util.Scanner;

public class DBConnection {
	public Connection connector() throws ClassNotFoundException, SQLException{
		Connection c=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","admin");
		Statement s=c.createStatement();
		return c; 
	}


}
