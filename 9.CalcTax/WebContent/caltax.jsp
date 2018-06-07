<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Employee</h1>
	<%
	String name=request.getParameter("name");
	String occupation=request.getParameter("occ");
	String gender=request.getParameter("gen");
	int income=Integer.parseInt(request.getParameter("income"));
	String why;
	int taxamount=0;
	if(income<10000)
	{
		taxamount=0;
		why="income less than 10000";
	}
	else if(income>10000 && income <20000)
	{
		taxamount=(int)(0.15*income);
		why="more than 10000 less than 20000";
	}
	else
	{
		taxamount=(int)(0.20*income);
		why="more than 20000";
	}
	
	session.setAttribute("name",name);
	session.setAttribute("occupation",occupation);
	session.setAttribute("gender",gender);
	session.setAttribute("income",income);
	session.setAttribute("taxamt",taxamount);
	session.setAttribute("why",why);
	out.println("<form method=get action=datacapture.jsp>"
			+"<input type=hidden name=fno value=2>"+"<input type=submit value=show>"+"</form>");
	%>
	
</body>

</html>