<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Paytm</title>
</head>
<body>
	<form action="ViewDetails.jsp" method="get">
		Flightno:<input type="text" name="flightno"><br>
		Date:<input type="text" name="date"><br>
		Customername:<input type="text" name="name"><br>
		Phoneno:<input type="text" name="pno"><br>
		<input type="submit" value="Book"><br>
	</form>
	<a href="ViewFlights.html">ViewFlights</a><br>
</body>
</html>