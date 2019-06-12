<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="Header.jsp"%>

<html>
<head>
<title>Update Product</title>
<style type="text/css">
td
 {
  text-align: center;
}
table.center{
margin-left:auto;
margin-right:auto;
text-align:center;
}
.center th{
text-align:center;
padding:4px;
}
</style>
</head>
<body>
<c:url var="updateUrl"  value="/UpdateProduct"/>
<form:form action="${updateUrl}"  modelAttribute="product" method="post">
<table class="center">
<tr>
<th>Update Product</th>
</tr>

<tr>
<td>Product Id</td>
<td><form:input path="productId" value="${product.productId}" readonly="true"/></td>
</tr>

<tr>
<td>Product Name</td>
<td><form:input path="productName" value="${product.productName}"/></td>
</tr>

<tr>
<td>Product Desc</td>
<td><form:input path="productDesc" value="${product.productDesc}"/></td>
</tr>

<tr>
<td>Stock</td>
<td><form:input path="stock" value="${product.stock}"/></td>
</tr>

<tr>
<td>Price</td>
<td><form:input path="price" value="${product.price}"/></td>
</tr>

<tr>
<td>Category</td>
<td><form:select path="categoryId">
    <form:option value="0" label="---SELECT CATEGORY ITEMS---"/>
     <form:options items="${categoryList}"/>
     </form:select></td>
</tr>

<tr>
<td>Supplier</td>
<td><form:select path="supplierId">
     <form:option value="0" label="---SELECT SUPPLIER ITEMS---"/>
     <form:options items="${supplierList}"/>
     </form:select></td>
</tr>

<tr>
<td colspan="2">
 <input type="submit" value="UpdateProduct" style="margin-left:50%"/>
</td>  
</tr>   
</table>
</form:form>
</body>
</html>