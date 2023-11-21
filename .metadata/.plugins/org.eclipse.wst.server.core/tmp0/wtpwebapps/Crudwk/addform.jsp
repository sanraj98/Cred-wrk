<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bike Form</title>
<style type="text/css">
   *{
   text-align: center;
   background-color:#020c14;
   }
   input[type=text]{background-color:white;
   border: 1px solid #ccc;
   height:23px;}
   label{color:#a19e9d}
   h2{color:#a19e9d;
   margin-top: 50px;
   margin-left:20px;}
   input[type=submit]{width:70px;
   height:35px;
   margin-left:20px;
   background-color:#4CAF50;
   color: white;
   cursor:pointer;
   border-radius:10px;}
</style>
</head>
<body>
<h2>Bike Form!</h2>
<form:form action="addfrm" method="post" modelAttribute="bikr">
	<label>Name : </label><form:input type="text" path="bName" placeholder="Enter bike name"/><br><br>
	<label>Model: </label><form:input type="text" path="Model" placeholder="Enter bike model"/><br><br>
	<label>Milage: </label><form:input type="text" path="Milage" placeholder="Enter bike milage"/><br><br>
	<input type="submit" value="add">
</form:form>
</body>
</html>