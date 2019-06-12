<%@ include file="Header.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Category</title>
<style type="text/css">
.container 
{
   table-align:center;
}
table.center{
   margin-left:auto;
   margin-right:auto;
}
td{
  padding:4px;
}
.center th{
     text-align:center;
     spacing:20px;
     padding:20px;
</style>
</head>
<body>
<form action="<c:url value="/UpdateCategory"/>" method="post">
<div class="container">
<table class="center">
<tr>
      <th colspan="2">Update Category</th>
</tr>

<tr>
    <td>Category Id</td>
    <td><input type="text" name="categoryId" value="${category.categoryId}" readonly/></td>
</tr>
<tr>
<td>Category Name</td>
<td><input type="text" name="categoryName" value="${category.categoryName}"/></td>
</tr>
<tr>
<td>Category Desc</td>
<td><textarea rows="7" cols="23" name="categoryDesc">${category.categoryDesc}</textarea></td>
</tr>
<tr>
<td colspan="2">
   <input type="submit" value="UpdateCategory" style="margin-left:48%"/>
</td>
</tr>    
</table>
</div>
</form>
</body>
</html>



