<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Create Transaction
	<form action="createTx">
		CIF:<input type="text" name="cif"><br>
		ACCOUNT NUMBER:<input type="text" name="accNo"><br>
		TRANSACTION ID:<input type="text" name="tranId"><br>
		AMOUNT:<input type="text" name="amt"><br>
		CURRENCY:<input type="text" name="currency"><br>
		DATETIME:<input type="text" placeholder="yyyy-MM-dd" name="time"><br>
		STATUS:<input type="text" name="status"><br>
		<input type="submit" value="Register">
	</form>
</body>
</html>