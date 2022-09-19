<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
	<title>Customer Confirmation Page</title>
</head>

<body>
	First name: ${customer.firstName}
	<br>
	Last name: ${customer.lastName}
	<br>
	Free passes: ${customer.freePasses}
	<br>
	Postal code: ${customer.postalCode}
	<br>
	Course code: ${customer.courseCode}
</body>

</html>