<%@include file="Header.jsp"%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.1/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<div class="container-fluid">
<div  class="content-wrapper">
    <div class="container">
        <h2>MY CART</h2>
     </div>
<div class="col-md-12">
 <div class="product col-md-3 service-image-left">
 <form action="<c:url value="/addToCart/${productId}"/>" method="post">
   <img id="item-display" class="img-thumbnail" width="400" height="200" src="<c:url value="/resources/images/${product.productId}.jpg"/>" alt="image">
 </div>
 <div class="product col-md-3 service-text-center">
<div class="product-title">${product.productName}</div>
<br/>
<div class="product-desc">${product.productDesc}</div>
<br/>
<hr>
<div class="product-price">INR ${product.price}</div>
<div class="prouct-stock">In Stock</div>
<div class="product-quantity">Quantity 
   <select name="quantity">
   <option value="1">1</option>
   <option value="2">2</option>
   <option value="3">3</option>
   <option value="4">4</option>
   </select>
</div>
</div>
<hr>
<div class="btn-group cart">
<input type="submit" class="btn btn-success" value="Add To Cart"/>
</div>
<div class="btn-group wishlist">
<input type="submit" class="btn btn-danger" value="Buy Now"/>
</div>
</div>
</div>
</div>
 </form>

