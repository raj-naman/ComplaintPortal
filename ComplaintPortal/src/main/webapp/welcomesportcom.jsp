<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
     
	 response.setHeader("Cache-Control" , "no-cache , no-store , must-revalidae");   
   
     if(session.getAttribute("username") == null){
    	 response.sendRedirect("/sportcomlogin");
     }
%>

<a href = "/sportcomlogout">Logout</a>

</br>
Welcome Sports Commitee

<table>
  <c:forEach items="${complaints}" var="comp">
    <tr>
      <td><a href = "/sportcomplaint/${comp.id}"><c:out value="${comp.roll}" /></a></td>
      <td><c:out value="${comp.name}" /></td>
    </tr>
  </c:forEach>
</table>


</body>
</html>