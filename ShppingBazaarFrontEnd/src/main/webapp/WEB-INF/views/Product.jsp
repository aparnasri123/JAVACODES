<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="Header.jsp"%>

<html>
<head>
<title>Product page</title>
<style type="text/css">

table.center{
margin-left:auto;
margin-right:auto;
text-align:center;
}

.center th{
text-align:center;
padding:20px;
}

td{
 padding:5px;
}

table.center1{
margin-left:auto;
margin-right:auto;
}
</style>
</head>
<body>
<form:form action="InsertProduct" modelAttribute="product" method="post" enctype="multipart/form-data">
<table class="center">
<tr>
<th colspan="7">Product Management</th>
</tr>
 
 <tr>
<td>Product Name</td>
<td><form:input path="productName" required="true"/></td>
</tr>

<tr>
<td>Product Desc</td>
<td><form:input path="productDesc" required="true"/></td>
</tr>

<tr>
<td>Price</td>
<td><form:input path="price" required="true"/></td>
</tr>

<tr>
<td>Stock</td>
<td><form:input path="stock" required="true"/></td>
</tr>

<tr>
<td>Category</td>
<td><form:select path="categoryId">
     <form:option value="0" label="--SELECT LIST--"/>
     <form:options items="${categoryList}" required="true" style="width:50px !important;"/> 
     </form:select></td>
</tr>

<tr>
<td>Supplier</td>
<td><form:select path="supplierId">
    <form:option value="0" label="---SELECT LIST---"/>
    <form:options items="${supplierList}" required="true" style="width:50px !important;"/>
     </form:select></td>
</tr>

<tr>
<td>Product Image</td>
<td><form:input type="file" path="pimage" required="true" style="margin-left:15%"/></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="Insert Product" style="margin-left:38%"/>
</tr>
</table>
</form:form>

<br><br>
   <table class="center1">
      <tr bgcolor="pink">
             <td>SL#</td>
             <td>ProductName</td>
             <td>ProductDesc</td>
             <td>Stock</td>
             <td>Price</td>
             <td>CategoryId</td>
             <td>SupplierId</td>
             <td colspan="2">Modification</td>
             </tr>
             <c:forEach items="${productList}" var="product">
             <tr>
             <td>${product.productId}</td>
             <td>${product.productName}</td>
             <td>${product.productDesc}</td>
             <td>${product.stock}</td>
             <td>${product.price}</td>
             <td>${product.categoryId}</td>
             <td>${product.supplierId}</td>
             <td>
             <a href="<c:url value="/editProduct/${product.productId}"/>">Edit</a>
             <a href="<c:url value="/deleteProduct/${product.productId}"/>">Delete</a>
             </td>
             </tr>
             </c:forEach>
        </table>
 </body>
 </html>
 