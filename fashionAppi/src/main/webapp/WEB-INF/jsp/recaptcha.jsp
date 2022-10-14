<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>




<html>
<c:if test="${not empty recaptchaUrl}">  <%-- wenn die Url definiert ist, rendern wir das Script --%>
  <script>
    grecaptcha.ready(function() {
      grecaptcha.execute("${reaptchaPublicKey}", {action: 'kontakt'})
        .then(function(token) {
          $("#recaptchaToken").val(token); 
    });
  });
  </script>
  <form:input type="hidden" path="recaptchaToken" id="recaptchaToken"/>
  <c:set var="error">
    <form:errors path="recaptchaToken" element="p"/>
  </c:set>
  <c:if test="${not empty error}">
    <div class="error-message active">
      <form:errors path="recaptchaToken" element="p" cssClass="dsErrorMsg" cssStyle="text-align: left"/>
    </div>
  </c:if>
</c:if>
</html>