<%@ include file="Header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Category</title>
<style type="text/css">
td
 {
  padding:5px;
}
table.center{
margin-left:auto;
margin-right:auto;
}
.center th{
 text-align:center;
 padding:20px;
 spacing:20px;
}
</style>
</head>
<body>
<form action="<c:url value="/UpdateSupplier"/>" method="post">
<table class="center">
<tr>
      <th colspan="2">Update Supplier</th>
</tr>

<tr>
    <td>Supplier Id</td>
    <td><input type="text" name="supplierId" value="${supplier.supplierId}"readonly/></td>
</tr>
<tr>
<td>Supplier Name</td>
<td><input type="text" name="supplierName" value="${supplier.supplierName}"/></td>
</tr>
<tr>
<td>Supplier Desc</td>
<td><textarea rows="7" cols="23" name="supplierDesc">${supplier.supplierDesc}</textarea></td>
</tr>
<tr>
<td colspan="2">
 <input type="submit" value="UpdateSupplier" style="margin-left:48%"/>
</td>
</tr>
</table>
</form>
</body>
</html>
