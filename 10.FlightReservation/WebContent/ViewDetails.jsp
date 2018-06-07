<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Customer</h1>
	<%
	String fno1=request.getParameter("flightno");
	String date1=request.getParameter("date");
	String cname1=request.getParameter("name");
	String pno1=request.getParameter("pno");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
	Statement st=con.createStatement();
	String query="select * from flight where fno="+fno1;
	ResultSet rs=st.executeQuery(query);
	if(rs.next()==false)
		out.println("No such flight exists");
	else
	{
		int seatno=(int)(Math.random()*500);
		String query1=String.format("insert into seat values('%s','%s',%d,'%s','%s')",fno1,date1,seatno,cname1,pno1);
		st.executeUpdate(query1);
		out.println("<h1>Booking Successful</h1>");
		out.println("<h3>Flightno:-</h3>"+fno1);
		out.println("<h3>Date:-</h3>"+date1);
		out.println("<h3>CustomerName:-</h3>"+cname1);
		out.println("<h3>Phonenumber:-</h3><br>"+pno1);
	}
	%>
</body>
<br><a href="ViewFlights.html">Search flights</a>
</html>