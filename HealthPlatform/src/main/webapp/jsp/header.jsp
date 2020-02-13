<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="url">${pageContext.request.contextPath}</c:set>
<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate value="${now}" type="date" pattern="yyyy-M-d" var="date" />
<link rel="stylesheet" type="text/css" href="${url}/style/main.css" />
<link rel="stylesheet" type="text/css" href="${url}/style/style.css" />
<link rel="stylesheet" type="text/css" href="${url}/style/menu.css" />
<script type="text/javascript" src="${url}/js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="${url}/js/menu.js"></script>
