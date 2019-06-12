<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CategoryPage</title>
<style type="text/css">
table.center{
    margin-left:auto; 
    margin-right:auto;
}
.center th{
      text-align:center;
      padding:20px;
  }
td{
    padding:4px;
}
.container{
    text-align:center;
}
table.center1
  {
    margin-left:auto; 
    margin-right:auto;
  }
</style>
</head>
<body>
<form action="<c:url value="/InsertCategory"/>" method="post">
<table class="center">
<tr>
      <th colspan="2">Category Management</th>
</tr>

<tr>
      <td>Category Name</td>
      <td><input type="text" name="CategoryName"/></td>
</tr>

<tr>
     <td>Category Desc</td>
	 <td><textarea cols="23" rows="7" name="CategoryDesc"></textarea></td>
</tr>
<tr>
     <td colspan="2">      
    <input type="submit" value="InsertCategory" style="margin-left:50%"/>
     </td>
</tr>
</table>
</form>

<br><br>
<div class="container">
<table class=center1>
	<tr bgcolor="lightgreen">
		               <td>SL#</td>
		               <td>CategoryName</td>
		               <td>CategoryDesc</td>
		               <td colspan=2>Modification</td>
	</tr>
	<c:forEach items="${categoryList}" var="category">
	<tr> 
		<td>${category.categoryId}</td>
	
		<td>${category.categoryName}</td>
	
		<td>${category.categoryDesc}</td>
		
		<td>
		<a href="<c:url value="/EditCategory/${category.categoryId}"/>">Edit</a>
		</td>
		<td>
		<a href="<c:url value="/DeleteCategory/${category.categoryId}"/>">Delete</a>
		</td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>




