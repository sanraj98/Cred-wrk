<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bike List</title>
<style type="text/css">
*{text-align:center;
  background-color:#020c14;
  color:white;
}
input{margin-right: 10px;}
h2{
text-align:center;
}
.tb{
   margin-top: 25px;
   margin-left: auto;
  margin-right: auto;
  width:70%;
  
}
.tb,th,td{
background-color:#32303b;
border: 1px solid;
border-color: white;
text-align: center;
}
.btn input[type=button]{
height:35px; 
width:70px;
margin-left:15px;
background-color:#4CAF50;
border: 1px solid #ccc;
border-radius:10px;
cursor:pointer;
}
.dele{background-color: #f54242;
cursor:pointer;
border: 1px solid #ccc;
border-radius:3.5px;}
.up{border-radius:3.5px;
border: 1px solid #ccc;
border-color:white;
cursor:pointer;
background-color:#426ff5;}
</style>
</head>
<body>
<h2>Bike List!</h2>
<table class="tb">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Model</th>
		<th>Milage</th>
		<th>Action</th>
	</tr>
   <c:forEach var="tbik" items="${bik}">
   <c:url var="upd" value="/updfrm">
   <c:param name="upid" value="${tbik.bId}"/>
   </c:url>
   <c:url var="delt" value="/delete">
   <c:param name="dele" value="${tbik.bId}"/>
   </c:url>
	<tr>
	  <td> ${tbik.bId} </td>
	  <td> ${tbik.bName}</td>
	  <td> ${tbik.model} </td>
	  <td>${tbik.milage}</td>
	  <td><a href="${upd}"><button class="up">update</button></a> | <a href="${delt}"><button class="dele">delete</button></a>
	  </td>
	</tr>
   </c:forEach>
</table>
<br>
<div class="btn">
<input type="button" value="Back" onclick="window.location.href='main'; return false;">
<input type="button" value="add bike" onclick="window.location.href='showfrm'; return false;">
</div> 
</body>
</html>