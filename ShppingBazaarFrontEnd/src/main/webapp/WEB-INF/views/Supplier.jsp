<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CategoryPage</title>
<style type="text/css">
.container1{
   text-align:center;
}
td{
  padding:4px;
}

 table.center{
    margin-left:auto; 
    margin-right:auto;
  }
  .center th{
     spacing:20px;
     padding:20px;
  }
  table.center1
  {
    margin-left:auto; 
    margin-right:auto;
  }
</style>
</head>
<body>
<form action="<c:url value="/InsertSupplier"/>" method="post">
<table class="center">
<tr>
      <th colspan="2">Supplier Management</th>
</tr>

<tr>
      <td>Supplier Name</td>
      <td><input type="text" name="supplierName"/></td>
</tr>

<tr>
     <td>Supplier Desc</td>
	 <td><textarea cols="23" rows="7" name="supplierDesc"></textarea></td>
</tr>
  

<tr>
     <td colspan="2">
             
             <input type="submit" value="InsertSupplier" style="margin-left:50%"/>
            
     </td>
</tr>

</table>
</form>

<br><br>
<div class="container1">
<table class="center1">
	<tr bgcolor="cyan">
		               <td>SL#</td>
		               <td>SupplierName</td>
		               <td>SupplierDesc</td>
		               <td colspan="2">Modification</td>
	</tr>
	<c:forEach items="${supplierList}" var="supplier">
	<tr> 
		<td>${supplier.supplierId}</td>
		<td>${supplier.supplierName}</td>
		<td>${supplier.supplierDesc}</td>
		<td><a href="<c:url value="/EditSupplier/${supplier.supplierId}"/>">Edit</a></td>
		<td><a href="<c:url value="/DeleteSupplier/${supplier.supplierId}"/>">Delete</a></td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>
