package Drivers;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;
public class Prestat {

	public static void main(String[] args) throws Exception
	{
		Properties p=new Properties();
		p.load(new FileInputStream("I:/eclips programs/Jdbc/src/Drivers/Info.properties"));
		Class.forName(p.getProperty("d"));
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		Connection con=DriverManager.getConnection(p.getProperty("url"),p);
		PreparedStatement pstmt=con.prepareStatement("delete raghav where sage=?");
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			//System.out.println("enter the sname");
			//String sname=sc.next();
			System.out.println("enter the sage");
			int sage=sc.nextInt();
			//System.out.println("enter the sId");
			//int sid=sc.nextInt();
			//System.out.println("enter the scollage");
			//String scollage=sc.next();
			//pstmt.setString(1,sname);
			pstmt.setInt(1,sage);
			//pstmt.setInt(3,sid);
			//pstmt.setString(4,scollage);
			int x=pstmt.executeUpdate();
			System.out.println(x + "rows inserted");
			System.out.println("if you want to enter next value press 1 else press any key");
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

