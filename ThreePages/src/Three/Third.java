package Three;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class Third extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=0;
		String name=null;
		String Email=null;
		String Address=null;
		try
		{
		id=Integer.parseInt(request.getParameter("ID"));
		name=request.getParameter("name");
		Email=request.getParameter("Email");
		Address=request.getParameter("Address");
		}
		catch(Exception e)
		{
			out.println("<marquee color='green'><h1>Please enter valied detailes</h1></marquee>");	
		}
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","waba12vixo");
			PreparedStatement pst=con.prepareStatement("insert into stu values(?,?,?,?)");
			pst.setInt(1,id);
			pst.setString(2, name);
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
			out.println("<marquee color='green'><h1>"+e.getMessage()+"</h1></marquee>");
		}
		
	}

}
//tr=table row,td=table definition
