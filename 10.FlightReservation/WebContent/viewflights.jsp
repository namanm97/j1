<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Showing flights</title>
</head>
<body>
<%
String wday1=request.getParameter("wday");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
Statement st=con.createStatement();
String query=String.format("select * from flight where wday='%s';",wday1);
//out.println(""+query);
ResultSet rs=st.executeQuery(query);
while(rs.next())
{
		out.println("FLIGHTS DETAILS ARE:-");
		out.println(""+rs.getInt(1));
		out.println(""+rs.getString(2));
}
%>
</body>
</html>