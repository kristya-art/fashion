<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<script src="https://www.google.com/recaptcha/api.js?render=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"></script> 
<script src="https://www.google.com/recaptcha/api.js"></script>

<html>
<form:form method="POST" action="addUser" id="form" >
	<table>
	    <tr>
	      <td><form:label path="username">user name</form:label></td>
	      <td><form:input path="username"/></td>
	    </tr>
	
		<tr>
		  <td>
		     <form:label path="password">Password</form:label>
		  </td>
		  <td><form:input path="password"/></td>
		</tr>
		
		<tr>
		  <td><form:label path="address">Address</form:label></td>
		  <td><form:input path="address"/></td>
		</tr>
		<tr>
		  <td><form:label path="receivePaper">Subscribe Newsletter</form:label></td>
		  <td><form:input  path="receivePaper" /></td>
		</tr>
		
		<tr>
		  <td><form:label path="favoriteFrameworks">Favorite Web Frameworks</form:label></td>
		  <td><form:checkboxes items="${webFrameworkList}" path="favoriteFrameworks" /></td>
		</tr>
		
		<tr>
		  <td><form:label path="gender">gender</form:label></td>
		  <td><form:radiobutton path="gender" value="M" label="Male" />
		  	  <form:radiobutton path="gender" vale="F" label="Female" />
		  </td>
		  
		</tr>
		
		<tr>
		  <td><form:label path = "favoriteNumber">Favorite Number</form:label></td>
		  <td><form:radiobuttons path="favoriteNumber" items="${numbersList}" /></td>
		</tr>
		
		<tr>
		  <td><form:label path="country">Country</form:label></td>
		  <td>
		   <form:select path = "country">
		     <form:option value = "NONE" label="Select"/>
		     <form:options items="${countryList}" />
		   </form:select>  
		  </td>
		</tr>
		
		<tr>
			<td><form:label path="artnr">Artikel Number</form:label></td>
			<td><form:input path="artnr"></form:input></td>
		<tr>
		
		<tr>
		  <td colspan = "2">
		    <input type="submit" value = "Submit" />
		  </td>
	   </tr>
	   
	   <tr>
	      <td >
	      <div id="error">here will be error message</div>
	      </td>
	   </tr>
	  
</table>




<!--  <div id="error"></div> -->
<!-- <input type="submit" value="Submit"/> -->
    
</form:form>



</html>

<script>

// window.onload= function(){
// 	let isValid = false;
// 	const form = document.getElementById('form');
// 	const error = document.getElementById('error');
	
// 	form.addEventListener('submit',function(e){
// 		e.preventDefault();
// 		const response = grecaptcha.getResponse();
// 		console.log(response);
// 	})
	
// }


</script>




<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

button {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}


</style>