<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>admin-main</title>
</head>
<body>
Update product
<table>
<form action="/afterUpdate" method="get">

	<tr> 
	<th>Product Name</th> 
	<th>Product Size</th>
	<th>Product Price</th>
	</tr>
<tr>
<td> <input type="text" name="pn" value="${productDetails.productname}" readonly="readonly"></td>
<td> <input type="text" name="ps" value="${productDetails.productsize}"></td>
<td> <input type="text" name="pp" value="${productDetails.productprice}"></td>
<td> <input type="submit"></td>

</tr>
</form>
</table>
</body>
</html>