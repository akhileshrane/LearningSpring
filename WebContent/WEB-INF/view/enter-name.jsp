<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Helo World - Input form</title>
</head>
<body>
<form action="processForm" method="GET">
	<input type="text" name="studentName" placeholder="What's your name?"/>
	
	<input type ="submit" />
</form>

<br> <br>

<form action="shout" method="GET">
	<input type="text" name="shoutName" placeholder="What's your name?"/>
	
	<input type ="submit" />
</form>
<br><br>

<form action="shoutV2" method="GET">
	<input type="text" name="shoutversion2" placeholder="What's your name?"/>
	
	<input type ="submit" />
</form>

</body>
</html>