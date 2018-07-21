<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <%@ page isELIgnored="false" %>
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Email</th><th>Address</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td><a href="editemp?id=<c:out value='${emp.ID}'/>"><c:out value='${emp.ID}'/></a></td>  
   <td>${emp.name}</td>  
   <td>${emp.email}</td>  
   <td>${emp.address}</td>  
   <td><a href="deleteemp?id=<c:out value='${emp.ID}'/>">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="empform">Add New Employee</a>  