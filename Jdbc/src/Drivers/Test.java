package Drivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
	Properties p=new Properties();
	p.load(new FileInputStream("I:/eclips programs/Jdbc/src/Drivers/Info.properties"));
	Class.forName(p.getProperty("d"));
	System.out.println(p.getProperty("user"));
	System.out.println(p.getProperty("password"));
    System.out.println(p.getProperty("url"));
    Connection con=DriverManager.getConnection(p.getProperty("url"),p);
    PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
    Scanner sc=new Scanner(System.in);
    while(true)
    {
    	System.out.println("enter ID");
    	int id=sc.nextInt();
    	ps.setInt(1, id);
    	System.out.println("enter name");
    	String name=sc.next();
    	ps.setString(2, name);
    	System.out.println("enter email");
    	String email=sc.next();
    	ps.setString(3, email);
    	System.out.println("enter address");
    	String address=sc.next();
    	ps.setString(4, address);
    	int x=ps.executeUpdate();
    	System.out.println("values are"+id+name+email+address);
    	System.out.println("if you want to press again press 1 else press ay key");
    	int i=sc.nextInt();
    	if(i==1)
    	{}
    	else
    	{
    		System.exit(0);
    	}
    }
    
	}

}
