<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<html>
<h2>welcome to artikel view</h2>


<form:form method="POST" action="addArtikel" onsubmit = "return false">
<table>
   <tr>
     <td><form:label path="artId">artikel id</form:label></td>
     <td><form:input path="artId"/></td>
   </tr>
   <tr>
     <td><form:label path="artnr">art number</form:label></td>
     <td><form:input path="artnr"/></td>
   </tr>
   
   <tr>
     <td colspan="2">
        <button  id="btn" type="submit" value="submit">go</button>
     </td>
   </tr>
</table>


<br><br>



   <b>Produktgruppen</b>
  <table>

    
    <tr>
      <td><input type="checkbox" name="select-all" id="select-all">Select Alle</td>
    </tr>
  
  <tr>
  
  
   <c:forEach items="${list}" var="artId">
    	<tr>
        <td><input type="checkbox"  name="artnr" value="artId" /></td>
       </tr>
  </c:forEach>
  
<!--    <tr> -->
<!--       <td><input type="checkbox" name="checkbox" id="checkbox" value="artId"></td> -->
<!--     </tr> -->
  
<!--   <tr> -->
  
<!--    <tr> -->
<!--       <td><input type="checkbox"  name="artId" id="artId" value="artId"></td> -->
<!--     </tr> -->
  
<!--   <tr> -->
    
  <tr>  <td><form:checkboxes items="${list}" path="artnr" label="${artnr}" value="${artId}"/></td></tr>
<%--     <td><form:checkboxes items="list" path="artnr" label="artnr" value="artId"/></td> --%>
  </tr>
  <br><br>
  
 <tr><td> <b>Dateiformat</b><td><tr>
  <tr>
<td><input type="radio" name="command" value="0"/>XLSX</td>
<td><input type="radio" name="command" value="1"/>CSV</td>

<td><input type="radio" name="command" value="2"/>XML</td>

<%--   <td><form:checkboxes items="${formats}" path="formats"/></td> --%>
  </tr>
		
		
<!-- <tr> -->
<!-- <tr> -->
<%-- <td><form:label path="format"></form:label></td> --%>
<!-- <td> -->
<%-- <form:radiobuttons path="format" items="${formats}"/> --%>
<!-- </td> -->
<!-- </tr> -->
        

<c:choose>
 <c:when test="${not empty list }">
  You described our customer service as
  <ul>
  <c:forEach items="${list}" var="artId">
    <li><c:out value="${artId}"/></li>
  </c:forEach>
  </ul>
 </c:when>
 <c:otherwise>
  You didn't choose any feedback checkboxes.
 </c:otherwise>
</c:choose>

     <td colspan="2"> 
     <input type="submit" value="Exportieren"/>
     </td>
</tr>   
</table>
</form:form>


</html>


<script> 
 	$('#select-all').click(function(event){
 		if(this.checked){
 			//iterate each checkbox
 			$(':checkbox').each(function(){
 				this.checked=true;
 			});
 		}else{
 			$(':checkbox').each(function() {
 				this.checked = false;
 			})
			
 		}
 	})
 </script> 













