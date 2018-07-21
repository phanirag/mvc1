package Drivers; 

import java.sql.*;

public class Type1test {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc.odbc:oracledsn","system","waba12vixo");
        System.out.println(con);
	}

}
