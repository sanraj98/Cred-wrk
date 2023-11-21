<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
<style type="text/css">
*{background-color:#1a1c2b;}
.fm form{
text-align:center;
opacity:0.8;
}
.fm h2{color:white;
margin-top:80px;
margin-left:40px}
.fm label{color:white;}
.fm label[for=sex]{margin-right:35px;}
.fm label[for=f]{margin-right:35px;}
.fm label[for=m]{margin-right:10px;}
.fm input[type=text]{background-color:white;
margin-left:5px;
padding:5px;}
.fm input[type=password]{
background-color:white;
margin-left:15px;
padding:5px;}
.fm input[type=email]{background-color:white;
margin-left:35px;
padding:5px;}
.fm input[type=date]{background-color:white;
width:10.5%;
padding:5px;
margin-left:30px;}
.fm input[type=submit]{border-radius:5px;
padding:7px;
background-color:#04AA6D;
border: 1px solid #ccc;
color:white;
cursor:pointer;
width:5%;
margin-left:45px;}
</style>
</head>
<body>
<div class="fm">
<form action="reg" method="post">
<h2>Register Form!</h2>
<label>User Name :</label><input type="text" name="uN" placeholder="enter ur name"/><br><br>
<label>Password :</label><input type="password" name="pas" placeholder="enter ur new password "/><br><br>
<label>Email :</label><input type="email" name="emal" placeholder="enter ur email"/><br><br>
<label for="sex">Sex :</label><input type="Radio" value="Male" name="sex"/><label for="m">Male</label><input type="Radio" value="Female" name="sex"/><label for="f">Female</label><br><br>
<label>Date :</label><input type="date" name="dt" value="2018-07-22"
       min="1990-01-01" max="2022-12-31"><br><br>
<input type="submit" value="Register">
</form>
</div>
</body>
</html>