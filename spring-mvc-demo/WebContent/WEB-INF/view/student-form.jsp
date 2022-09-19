<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
<title>Student Form</title>
</head>

<body>
	
	<form:form action="processForm" modelAttribute="student">
	
	First name: <form:input path="firstName"/>
	<br><br>
	Last name: <form:input path="lastName"/>
	<br><br>
	Country: 
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>
		
	</form:select>
	
	<br><br>
	Favorite Programming Language: 
	<br>
	
	<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
	
	<br><br>
	
	Operating Systems:
	<br>
	
	<form:checkboxes items="${student.operatingSystemsOptions}" path="operatingSystems"/>
	<input type="submit" value="Submit">
	
	</form:form>
	

</body>


</html>