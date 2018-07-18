package org.RESTORM.Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.RESTORM.Dao.impl.EmployeeDaoImpl;
import org.RESTORM.model.Employee;


@Path("employees")
@Consumes("application/json")
@Produces("application/json")
public class MyResource {
 
    @GET
    public List<Employee> getEmployee() {
    	EmployeeDaoImpl dao = new EmployeeDaoImpl();
        List<Employee> employees = dao.getEmployees();
        return employees;
    }
 
    
    @POST
    @Path("/create")
    public Response addEmployee(Employee emp){
        emp.setName(emp.getName());
        emp.setAge(emp.getAge());
                
        EmployeeDaoImpl dao = new EmployeeDaoImpl();
        dao.addEmployee(emp);
        
        return Response.ok().build();
    }
    
    @PUT
    @Path("/update/{id}")
    public Response updateEmployee(@PathParam("id") int id, Employee emp){
    	EmployeeDaoImpl dao = new EmployeeDaoImpl();
        int count = dao.updateEmployee(id, emp);
        if(count==0){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.ok().build();
    }
    
    @DELETE
    @Path("/delete/{id}")
    public Response deleteEmployee(@PathParam("id") int id){
        EmployeeDaoImpl dao = new EmployeeDaoImpl();
        int count = dao.deleteEmployee(id);
        if(count==0){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.ok().build();
    }
}