<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="createTicket">
		<label>Repair Type</label>
		<input type="text" name="repairType"><br>
		<label>Repair Header</label>
		<input type="text" name="repairHeader"><br>
		<label>Customer Description</label>
		<input type="text" name="customerDescription"><br>
		<label>Customer ID</label>
		<input type="text" name="customerId">
		<input type="submit" value="submit">
	</form> <br>
	
	<form action="getTicket">
		<label>Ticket ID</label>
		<input type="text" name="tid"><br>
		<input type="submit" value="submit">
	</form>

</body>
</html>