<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Bank Account</h1>
	<form action="registerAccount">
		Cif:<input type="text" name="cif"><br>
		Account Number:<input type="text" name="accNo"><br>
		Date of Opening :<input type="text" placeholder="yyyy-MM-dd" name="openingDate"><br>
		Balance:<input type="text" name="balance"><br><br>
		Status:<input type="text" name="status"><br>
		
		<input type="submit" value="Register">
	</form>
</body>
</html>