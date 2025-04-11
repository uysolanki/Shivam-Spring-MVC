<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="saveStudentDetails" 	modelAttribute="student" method="post">
	Roll Number :<form:input path="rno" /> <br>
	
	Name :<form:input path="sname"/> <br>

	Percentage :<form:input path="per" /> <br>
	
	<input type="submit" value="REGISTER" name="s1">
</form:form>
</body>
</html>