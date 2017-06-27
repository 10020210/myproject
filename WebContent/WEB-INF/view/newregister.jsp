 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
  
<table border="2" width="70%" cellpadding="2">  
<tr><th>salutation</th><th>firstname</th><th>middlename</th><th>lastname</th></tr>fullname</th></tr>aadhar</th></tr>gender</th></tr> DOB*</th></tr> DOB*</th></tr>DOB*</th></tr>DOB*</th></tr>DOB*</th></tr>DOB*</th></tr>DOB*</th></tr>DOB*</th></tr>         
   <c:forEach var="user" items="${user}">   
   <tr>  
	   <td>${user.salutation}</td>  
	   <td>${user.fname}</td>  
	   <td>${user.mname}</td>  
	   <td>${user.lname}</td>  
	     <td>${user.fullnameOnCard}</td>  
	       <td>${user.fathername}</td>  
	         <td>${user.aadharcardNo}</td>  
	           <td>${user.gender}</td>  
	             <td>${user.dob}</td>  
	               <td>${user.email}</td>  
	                 <td>${user.mobilenumber}</td>  
	                   <td>${user.emergencyContact}</td>  
	                     <td>${user. disability}</td>  
	                       <td>${user.password}</td>  
	                         <td>${user.address}</td>  
	                           <td>${user.street}</td>  
	                             <td>${user.pincode}</td>  
	                               <td>${user.tempaddress}</td> 
	                                 <td>${user.tempstreet}</td> 
	                                   <td>${user.temparea}</td> 
	                                     <td>${user.temppincode}</td> 
	                                      
   </tr>  
   </c:forEach>  
   </table>  