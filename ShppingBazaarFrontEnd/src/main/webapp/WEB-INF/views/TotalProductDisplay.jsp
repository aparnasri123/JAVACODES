<%@include file="Header.jsp"%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.1/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<div class="container-fluid">
<div  class="content-wrapper">
<div class="col-xs-1 text-center">
<section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading">MY CART</h1>
     </div>
</section>

<div class="col-md-12">
 <div class="product col-md-3 service-image-left">
 <form action="<c:url value="/addcart/${productId}"/>" method="post">
 <center>
   <img id="item-display" src="<c:url value="/resources/images/${product.productId}.jpg"/>" alt="image">
 </center>
 
 </form>
 </div>
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
</div>

