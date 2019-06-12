<%@ include file="Header.jsp"%>
<html>
<head>
<title>ProductPage</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class="row text-center text-lg-left">
<c:forEach items="${productList}" var="product">
<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12">
<c:if test="${product.stock>0}">
<a href="<c:url value="/totalProductDisplay/${product.productId}"/>" class="d-block mb-4 h-100">
</c:if>
<img src="<c:url value="/resources/images/${product.productId}.jpg"/>" class="img-thumbnail" alt="airconditioners" width="400" height="250">
</a>
<p>Price:${product.price}</p>
<p>Stock:<c:if test="${product.stock>0}">${product.stock}</c:if>
          <c:if test="${product.stock<=0}">
          <font color="red">Out Of Stock</font>
           </c:if>
</p>

<p><strong>${product.productName}</strong></p>

</div>
</c:forEach>
</div>
</div>
</body>
</html>
