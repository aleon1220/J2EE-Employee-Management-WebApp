<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Employee</title>
</head>
<body>
<f:view>
<center>
<h:outputText value="Register Employee" style='font-family: "Arial"; color: #400000; font-size: 22px'/>
<h:form>
<h:panelGrid border="1" columns="2">
		
			<h:outputText value="Employee Name"></h:outputText>
			<h:inputText style="height: 27px" value="#{employeeBean.name}" required="true" 
			requiredMessage="The Employee name is required"></h:inputText>
			<h:outputText value="Employee Experience"></h:outputText>
			<h:inputText style="height: 27px" id="exp" value="#{employeeBean.exp}">
			<f:validator validatorId="ExpValidator"/>
			</h:inputText>
			<h:outputText value="Technology"></h:outputText>
		<h:selectOneMenu style="width: 122px" id="expmenu" value="#{employeeBean.technology}"  required="true" 
		requiredMessage="Please select one technology">
		<f:selectItem itemLabel="--select--" itemValue="--select--"/> 
		<f:selectItem itemLabel="Java" itemValue="JAVA"/> 
		<f:selectItem itemLabel="OS" itemValue="OS"/> 
		<f:selectItem itemLabel="DOT NET" itemValue="DOT NET"/> 
		<f:selectItem itemLabel="MF" itemValue="MF"/> 
		<f:selectItem itemLabel="OTHER" itemValue="OTHER"/> 
		</h:selectOneMenu>
				
		<h:outputText value="Description"></h:outputText>
		<h:inputTextarea id="input" value="#{employeeBean.description}" required="true"
		requiredMessage="Please enter a description"></h:inputTextarea>

		<h:commandButton id="submit" type="submit" value="Register"	action="#{employeeBean.addEmployee}">
		</h:commandButton>
		<h:commandButton id="reset" type="reset" value="Reset">
		</h:commandButton>
			
	</h:panelGrid>
	</h:form>
	<h:form>
	<h:messages></h:messages>
	<h:outputText value="#{employeeBean.message}"></h:outputText>
	</h:form>
	<h:outputLink value="Home.jsp">Home</h:outputLink>
	</center>
</f:view>
</body>
</html>