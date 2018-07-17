package Three;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Properties;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Properties;


public class First extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
  
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=0;
		String Name=null;
		String Email=null;
		String Address=null;
		try
		{ 
		id=Integer.parseInt(request.getParameter("ID"));
		Name=request.getParameter("Name");
		Email=request.getParameter("Email");
		Address=request.getParameter("Address");
		}
		catch(Exception e)
		{
			out.println("<marquee color='green'><h1>Please enter valied detailes</h1></marquee>");	
		}
		try{
			Properties p=new Properties();
			p.load(new FileInputStream("I:/eclips programs/Jdbc/src/Drivers/Info.properties"));
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));
			Class.forName(p.getProperty("d"));
			Connection con=DriverManager.getConnection(p.getProperty("url"),p);
			PreparedStatement pst=con.prepareStatement("insert into stu values(?,?,?,?)");
			pst.setInt(1,id);
			pst.setString(2, Name);
			pst.setString(3, Email);
			pst.setString(4, Address);
			int i=pst.executeUpdate();
			if(i!=0)
				out.println("<marquee color='green'><h1>Reg Succesfull</h1></marquee>");
			else
				out.println("<marquee color='red'><h1>Reg notSuccesfull</h1></marquee>");
			}
		catch(Exception e)
		{
			out.println(id);
			out.println(Name);
			out.println(Email);
			out.println(Address);
			out.println("<marquee color='green'><h1>"+e.getMessage()+"hello"+"</h1></marquee>");
		}
		
	}

}
//tr=table row,td=table definition