<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Order Confirmed</h1>
	<h2>Order details</h2>
	<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
	Statement st=con.createStatement();
	String q="select * from tshirt";
	ResultSet rs=st.executeQuery(q);
	out.println("<table border=1px><tr><th>ORDERNO</th><th>ACCESORIES</th><th>POCKET</th><th>TAGLINE</th><th>COLOR</th></tr>");
	while(rs.next())
	{
		out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr>"
			);
	}
	out.println("</table>");
	%>
</body>
</html>