<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Report</title>
</head>
<body>
<f:view>
	<center><h:outputText value="Report"></h:outputText> <h:form style="width: 578px">
		<h:panelGrid border="1" columns="2" style="width: 529px; height: 57px">
			<h:outputText value="Technology"></h:outputText>
			<h:selectOneMenu style="width: 122px" id="empmenu" value="#{employeeBean.technology}" valueChangeListener="#{employeeBean.getEmployeesByTechnology}" onchange="submit()"
				required="true" requiredMessage="Select at least one technology">
				<f:selectItem itemLabel="--select--" itemValue="--select--"/>
				<f:selectItems value="#{employeeBean.availableTechList}" id="relist" />
			</h:selectOneMenu>
		</h:panelGrid>

		<h:dataTable border="1" value="#{employeeBean.empList}" var="row">
			<h:column id="column1">
				<f:facet name="header">
				<h:outputText value="Registration Id" />
				</f:facet>
				<h:outputText value="#{row.regId}" />
			</h:column>
			
			<h:column id="column2">
				<f:facet name="header">
					<h:outputText value="Name" />
				</f:facet>
				<h:outputText value="#{row.name}" />
			</h:column>
			
			<h:column>
				<f:facet name="header">
					<h:outputText value="Experience" />
				</f:facet>
				<h:outputText value="#{row.experience}" />
			</h:column>
			
			<h:column>
				<f:facet name="header">
				<h:outputText value="Description" />
				</f:facet>
				<h:outputText value="#{row.description}" />
			</h:column>
			
		</h:dataTable>
	</h:form>
	</center>
	<h:form>
		<center><h:messages></h:messages>
		<h:outputText value="#{employeeBean.message}"></h:outputText><br>
		<h:outputLink value="Home.jsp">Home</h:outputLink></center>
	</h:form>
</f:view>
</body>
</html>