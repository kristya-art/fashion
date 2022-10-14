<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<html>

<%--<table>
	<tr>
	  <td>User name</td>
	  <td>${username}</td>
	</tr>
	
	<tr>
	  <td>Password</td>
	  <td>${password}</td>
	</tr>
	<tr>
	  <td>Address</td>
	  <td>${address}</td>
	</tr>
	<tr>
	  <td>Subscribe to Newsletter</td>
	  <td>${receivePaper}</td>
	</tr>
	<tr>
	  <td>Favorite Web Frameworks</td>
	  <td><% String[] favoriteFrameworks = (String[])request.getAttribute("favoriteFrameworks");
	  	for(String framework: favoriteFrameworks){
  		out.println(framework);
   		} %></td>
	</tr>
	<tr>
	  <td>Gender</td>
	  <td>${(gender=="M"? "Male" : "Female")}</td>
	</tr>
	
	<tr>
	  <td>Favorite Number</td>
	  <td>${favoriteNumber}</td>
	</tr>
	<tr>
	  <td>Country</td>
	  <td>${country}</td>
	</tr>
</table>
<h1>testing ... </h1>
 --%>
   <title>A am  a user page</title>
 <table>

  <tr><td>User name</td>
	  <td>${username}</td>
 </tr>
  <tr>	
  <td>Article Number</td>  
	  <td>${artnr}</td>
</tr>
 </table>
</html>