<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<f:view>
<center>
	<h3>Welcome to Employee Management Portal</h3>
	<h:outputLink value="RegisterEmployee.jsp" >Register Employee</h:outputLink><br>
	<h:outputLink value="Report.jsp" >Report</h:outputLink>
</center>
</f:view>
</body>
</html>