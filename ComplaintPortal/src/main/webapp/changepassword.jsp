<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
     
 	 response.setHeader("Cache-Control" , "no-cache , no-store , must-revalidate");   
   
      if(session.getAttribute("username") == null){
     	 response.sendRedirect("/studentlogin");
      }
%>



<form action="/changepassword">
	
	Roll No. <input type = "text" name = "roll"><br>
	Old Password: <input type = "password" name = "oldpass"><br>
	New Password: <input type = "password" name = "newpass"><br>
	<input type = "submit" value = "Change Password">

</form>

</body>
</html>