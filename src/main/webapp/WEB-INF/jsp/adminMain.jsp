<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>admin-main</title>
</head>
<body>
	<h1>admin-main</h1>
	<h1>All User</h1>
	<table border="1">
		<tr>
			<th>User-Id</th>
			<th>User-Name</th>
			<th>User-Password</th>
		</tr>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<c:forEach items="${Databasebean}" var="viewUsers">
			<tr>
				<td>${viewUsers.userid}</td>
				<td>${viewUsers.username}</td>
				<td>${viewUsers.userpassword}</td>

			</tr>
		</c:forEach>
		    
	</table>
	<br>
	<br>
	<br>
	<h1>All products</h1>
	<table border="1">
		<tr>
			<th>Product Name</th>
			<th>Product Size</th>
			<th>Product Price</th>
			<th colspan="2">Action</th>
		</tr>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<c:forEach items="${Productbean}" var="viewUsers">
			<tr>
				<td>${viewUsers.productname}</td>
				<td>${viewUsers.productsize}</td>
				<td>${viewUsers.productprice}</td>
				<td><a
					href="/deleteProduct?pn=${viewUsers.productname}&ps=${viewUsers.productsize}&pp=${viewUsers.productprice}">
						Delete product</a></td>
				<td><a
					href="/updateProductJsp?pn=${viewUsers.productname}&ps=${viewUsers.productsize}&pp=${viewUsers.productprice}">
						Update product</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="/addJspMethod"> Add new product </a></td>
		</tr>
	</table>

	<br>
</body>
</html>