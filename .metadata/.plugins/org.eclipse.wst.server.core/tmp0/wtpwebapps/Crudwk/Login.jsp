<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
*{text-align:center;
background-color:#1a1c2b;}
.txt{border: 1px solid #ccc;
text-align:left;
background-color:white;
padding: 6px;
width:15%}
.txt1{border: 1px solid #ccc;
text-align:left;
background-color:white;
width:15%;
padding:6px;
margin-left:10px;}
h2{margin-top:150px;
color:white;
margin-left:70px;}
.bt{margin-left:70px;
margin-right:20px;
padding:7px;
border-radius:5px;
background-color:#f54242;
color:white;
border: 1px solid #ccc;
cursor:pointer;
}
.st{border-radius:5px;
padding:7px;
background-color:#04AA6D;
border: 1px solid #ccc;
color:white;
cursor:pointer;
width:5%;
}
.frm form{;
opacity:0.8;}
label{color:white;}
</style>
</head>
<body>
<div class="frm">
<form:form action="log">
<h2>Login Form!</h2>
<label>User Name :</label><input type="text" name="un" placeholder="Enter  user name" class="txt"><br><br>
<label>Password :</label><input type="password" name="psd" placeholder="Enter password" class="txt1"><br><br>
<input type="button" value="Register" class="bt" onclick="window.location.href='rg'; return false;"> <input type="submit" value="login" class="st"> 
</form:form>
</div>
</body>
</html>