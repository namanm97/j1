<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="java.util.Date" %>
<%@page import="java.util.Map.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String fno=request.getParameter("fno");
if(fno.equals("1"))
{
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");
HashMap<String,String> m=new HashMap<String,String>();
m.put("rupesh","001");
m.put("kumar","002");

if(m.containsKey(uname)==false)
{
	out.println("<h2>No such user exists</h2>");
	out.print("<a href=login.html>Click here to Try Again</a>");
}
else if(pass.equals(m.get(uname))==false)
{
	out.println("<h2>invalid password</h2>");
	out.println("<a href=login.html>Click here to try again</a><br>");
}
else
{
	out.println("<h1>Welcome user</h1>");
	Date date=new Date();
	out.println("<h2>Today's date:-"+date+"</h2>");
	out.println("<form method=post action=caltax.jsp>"+
	"Name:<input type=text name=name><br>"+
	"Occupation:<select name=occ>"+
	"<option value=iit>IIT</option>"+
	"<option value=msrit>MSRIT</option>"+
	"</select><br>"+
			"Gender<select name=gen>"+
	"<option value=male>Male</option>"+"<option value=female>Female</option>"+
			"</select><br>"+"Income<input type=text name=income><br>"+"<input type=submit value=submit>"
			);	
}
}
else
{
	out.println("<h1>TAX DETAILS</h1>");
	out.println("<h3>NAME:---"+session.getAttribute("name")+"</h3>");
	out.println("<h3>Occupation:---"+session.getAttribute("occupation")+"</h3>");
	out.println("<h3>Gender:---"+session.getAttribute("gender")+"</h3>");
	out.println("<h3>Income:---"+session.getAttribute("income")+"</h3>");
	out.println("<h3>IncomeTax:---"+session.getAttribute("taxamt")+"</h3>");
	out.println("<h3>Reason:---"+session.getAttribute("why")+"</h3>");
	
	session.invalidate();
	
}
%>
<a href="login.html">Logout</a>
</body>
</html>