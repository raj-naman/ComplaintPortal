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
  	Roll No.<input type = "text" name = "roll" required><br>
  	Name<input type = "text" name = "name" required><br>
  	Hostel<input type = "text" name = "hostel" required><br>
  	Room No.<input type = "text" name = "room" required><br>
  	Degree<input type = "text" name = "degree" required><br>
  	Year<input type = "text" name = "year" required><br>
  	Complaint Type: 
	<select name = "ctype" autofocus required>
	<option value="sac">Electricity</option>
	<option value="mess">Food</option>
	<option value="mess">Canteen</option>
	<option value="sac">Cleaning</option>
	<option value="sport">Sports</option>
	<option value="hostel">Others</option>
	</select>
	</br>
	Complaint<textarea name="compbody" required style="width:200px; height:100px;"></textarea>
	<br>
	Password <input type = "password" name = "password" required>
  	<input type = "submit">
  </form>


</body>
</html>