<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
<head>
<title>index</title>
<style type="text/css">
*{text-align:center;
background-color: #020c14;
}
h2{color:white;
 margin-top: 40px;
}
input{background-color:#4CAF50;
color: white;
height:45px;
width: 100px;
border-radius:10px;
cursor: pointer;
}
</style>
</head>
<body>
<h2>Welcome To The Bike World!</h2>
<form action="showfrm">
<input type="submit" value="Add bike">
</form>
<form action="showlist">
<input type="submit" value="Get bike list">
</form>
</body>
</html>
