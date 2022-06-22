<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>

<html>

<jsp:scriptlet>
String[] names = new String[]{"Product 1" , "Product 2", "Product 3", "Product 4", "Product 5", "Product 6", "Product 7"};
pageContext.setAttribute("variables", names);
</jsp:scriptlet>

<%-- JSP foreach tag --%>
<c:forEach var="names" items="${pageScope.variables}">
<c:out value="${names}"/> <br> <br>
</c:forEach>


</html>
