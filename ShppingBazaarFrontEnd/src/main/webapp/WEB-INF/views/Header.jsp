<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Home Page</title>
<meta name="viewport" content="width=device-width,initial-scale=1"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"/>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<style type="text/css">
.nav{
background-color:A0D6FC !important;
}
.navbar-brand {
    color:black !important;
}
.nav-link{
  color:471A94 !important;
  }
</style>
</head>
<body>
<nav class="nav navbar-default">
<div class="container-fluid">
   <div class="navbar-header">
      <a class="navbar-brand" href="#">ShoppingBazaarFrontEnd</a>
<ul class="nav nav-tabs">
  <li class="nav-item">
    <a class="nav-link active" href="index.jsp">Home</a>
  </li>
  <li>
    <a class="nav-link" href="login">Login</a>
  </li>
  <li>
    <a class="nav-link" href="register">Register</a>
  </li>
  <li>
    <a class="nav-link" href="category">CategoryManagement</a>
  </li>
  <li>
    <a class="nav-link" href="supplier">SupplierManagement</a>
  </li>
  <li>
    <a class="nav-link" href="product">ProductManagement</a>
  </li>
  <li>
  <a class="nav-link" href="productPage">Products</a>
  </li>
  <li>
  <a class="nav-link" href="totalProductDisplay">ProductDisplay</a>
  </li>
</ul>
</div>
</div>
</nav>
</body>
</html>

