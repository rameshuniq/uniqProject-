<html>
<head>
<title>login-jsp</title>
</head>
<style>
body{
	text-align: center;
	font-size: 30px;
}
</style>
<body>
	<h2>Admin login</h2>
	<form action="" method="post">
		<input type="text" name="adminId" placeholder="admin-Id" /> <br>
		<br> <input type="password" name="adminPassword"
			placeholder="admin-Password" /> <br> <br>
		<input type="submit">
	</form>

	<br>
	<br>
	<br>
	<h2>User login</h2>
	<form action="/userlogin" method="post">
		<input type="text" name="userId" placeholder="user-Id" /> <br> <br>
		<input type="password" name="userPassword" placeholder="user-Password" />
		<br> <br>
		<button>submit</button>
	</form>

</body>
</html>