<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action="/success" method = "post">
  	Roll No.<input type = "text" name = "roll"><br>
  	Name<input type = "text" name = "name"><br>
  	Hostel<input type = "text" name = "hostel"><br>
  	Room No.<input type = "text" name = "room"><br>
  	Degree<input type = "text" name = "degree"><br>
  	Year<input type = "text" name = "year"><br>
  	Complaint Type <select name="ctype"  multiple>
	  <option value="electric">Electricity</option>
	  <option value="cleaning">Cleaning</option>
	  <option value="bathroom">Bathroom</option>
	  <option value="mess">Mess</option>
	</select>
	</br>
	Complaint<textarea name="compbody" style="width:200px; height:100px;"></textarea>
	Password <input type = "password" name = "password">
  	<input type = "submit">
  </form>


</body>
</html>