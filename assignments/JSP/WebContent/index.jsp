<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%!
				int i = 0;
				/* i++; */
		%>
			Some static contents :
			<%-- Hello, today it's :
			<%= new Date() %> --%>
		
			Value if i
			<b> <%= i++ %><br> </b>
			
			<% out.println("Welcome User"); %>
			including through Directive
			
			<%@ include file="demoinclude.jsp" %><br>
			including through Standard Action<br>
			<jsp:include page="today.jsp"  />
			<jsp:forward page="today.jsp"  />
			
			
</body>
</html>