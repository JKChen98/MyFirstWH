<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<c:set var="url">${pageContext.request.contextPath}</c:set>
  </head>
  
  <body>
  <script type="text/javascript">
  alert('${errorMessage}');
  window.location.href = "${url}/jsp/main.jsp";
  </script>
 
  </body>
</html>
