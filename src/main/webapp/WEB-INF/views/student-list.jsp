<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        table {
            width: 50%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
<h1>Student List</h1>
    <table>
        <thead>
            <tr>
                <th>Rno</th>
                <th>Name</th>
                <th>Percentage</th>
            </tr>
        </thead>
        <tbody>
			<c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.rno}</td>
                    <td>${student.sname}</td>
                    <td>${student.per}</td>
                </tr>
            </c:forEach>
              </tbody>
    </table>
</body>
</html>