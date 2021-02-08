<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="b1" class="com.sj.User">
	</jsp:useBean>
	
	<jsp:setProperty property="uname"  name="b1"  />
	<jsp:setProperty property="password"  name="b1"  />
	
	Is user authenticate?
	<%=b1.isValid() %>
	
	The result is:
	<% if(b1.isValid()) 
	out.println("Welcome");
	else
	out.println("not a valid user");
	%>
	
</body>
</html>