
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IIITB COMPLAINT PORTAL</title>
<link href="/css/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
</head>

<body>
<nav class="navbar navbar-expand-md navbar-dark fixed-top" id="banner">
	<div class="container">
  <!-- Brand -->
  <a class="navbar-brand" href="#"><span>IIIT</span> Bangalore</a>

  <!-- Toggler/collapsibe Button -->
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>

  <!-- Navbar links -->
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
        <a class="nav-link" href="/wardenlogin">Warden</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/netcomlogin">NetCom</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/fcomlogin">FoodCom</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/saclogin">SAC</a>
      </li> 
       <li class="nav-item">
        <a class="nav-link" href="/sportcomlogin">SportCom</a>
      </li> 
	   <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="/aboutUs" id="navbardrop" data-toggle="dropdown">
        About us
      </a>
      <div class="dropdown-menu" >
        <a class="dropdown-item" href="/aboutUs">About Us</a>
        <a class="dropdown-item" href="/feedback">Feedback</a>
      </div>
    </li>
    </ul>
  </div>
	</div>
</nav>

<div class="banner">
	<div class="container">
	<div class="banner-text">
	<div class="banner-heading">
	COMPLAINT PORTAL FOR IIITB
	</div>
	<div class="banner-sub-heading">
	24*7 Up for YOU buddies !!
	</div>
	<a href="/addComplaint" class="btn btn-info btn-warning text-dark" role="button">ADD COMPLAINT</a>
	
<!-- 	<button href = "/addComplaint" type="button" class="btn btn-warning text-dark btn-banner">Add Complaint</button><br><br> -->
	<a href="/complaints" class="btn btn-info btn-warning text-dark" role="button">TRACK YOUR COMPLAINTS</a>
<!-- 	<button type="button" class="btn btn-warning text-dark btn-banner">Your Complaints</button> -->
	
	</div>
	</div>
</div>
<section id="about">
<div class="container">
	<div class="text-intro">
	<h2>About Us</h2>
		<p> /// </p>
	</div>
</div>
</section>


<h1>Complaint Portal for IIITB</h1>

<a href = "/addComplaint">Add Complaint</a>
</br>

<a href = "/fcomlogin">Food Commitee Login</a>
</br>

<a href = "/saclogin">SAC Login</a>
</br>

<a href = "/wardenlogin">Warden Login</a>
</br>

<a href = "/sportcomlogin">Sports Commitee Login</a>
</br>

<a href = "/trackstatus">Track Status</a>
</br>

<a href = "/complaints">Your Complaints</a>
</br>
</body>
</html>