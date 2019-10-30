<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Cat Score</title>
</head>
<body>

<p>${error}</p>
<p>${notsaved}</p>
<form action = "saveTest" method = "post">
<p>User: <input type = "text" name = "user" required/></p>
<p>q1: <input type = "number" name = "q1" value = "0"/></p>
<p>q2: <input type = "number" name = "q2" value = "0"/></p>
<p>q3: <input type = "number" name = "q3" value = "0"/></p>
<p>q4: <input type = "number" name = "q4" value = "0"/></p>
<p>q5: <input type = "number" name = "q5" value = "0"/></p>
<p>q6: <input type = "number" name = "q6" value = "0"/></p>
<p>q7: <input type = "number" name = "q7" value = "0"/></p>
<p>q8: <input type = "number" name = "q8" value = "0"/></p><br />
<p><input type = "submit" value="Save" /></p>

</form>

</body>
</html>