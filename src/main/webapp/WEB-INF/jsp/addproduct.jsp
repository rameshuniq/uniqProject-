<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>admin-main</title>
</head>
<body>
Add product
<table>
<form action="/AddProduct" method="post">

	<tr> 
	<th>Product Name</th> 
	<th>Product Size</th>
	<th>Product Price</th>
	</tr>
<tr>
<td> <input type="text" name="pname"></td>
<td> <input type="text" name="psize"></td>
<td> <input type="text" name="pprice"></td>
<td> <input type="submit"></td>

</tr>
</form>
</table>
</body>
</html>