package Drivers; 

import java.sql.*;

public class Type2test {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:oci:@localhost:1521:xe","system","waba12vixo");
        System.out.println(con);
	}

}