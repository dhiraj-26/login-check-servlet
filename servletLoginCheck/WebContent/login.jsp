<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method ="get" >

<input type="hidden" name="requestAction" value="login" />

<h2>Please Enter login Credentials</h2>
	<table>
		<tr>
			<th>Id</th>
			<td><input type="text" name="id" /></td>
		</tr>

		<tr>
			<th>Password</th>
			<td><input type="password" name="password" /></td>
		</tr>

		<tr>
			<td>&nbsp;</td>
			<td><input type="submit" value="Login" /></td>
		</tr>
		
		
	</table>
	</form>
</body>
</html>

		
		
		