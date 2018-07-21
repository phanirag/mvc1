package Drivers;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcProperties {
	public static void main (String[] args) throws Exception{
		Properties p=new Properties();
		p.load(new FileInputStream("I:/eclips programs/Jdbc/src/Drivers/Info.properties"));
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		//Class.forName("oracle.jdbc.OracleDriver");
		Class.forName(p.getProperty("d"));
		Connection con=DriverManager.getConnection(p.getProperty("url"),p);
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",p);
		System.out.println(con);
		
				
	}

}
