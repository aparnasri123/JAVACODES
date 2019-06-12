<%@include file="/WEB-INF/views/Header.jsp"%>

<html lang="en">
<head>
  <title>ShoppingBazaarFrontEnd</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style type="text/css">
    
    h3{
       color:63B382 !important;
       text-align:center;
    }
    h4{
       color:F7FE03 !important;
       text-align:center;
      }
    h5{
        color:26FC03 !important;
        text-align:center;
    }
  </style>
</head>
<body>
<div class="container">
  <h2>Welcome To Our Cool Zone</h2>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img class="img-responsive" src="<c:url value="/resources/images/lloyd.jpg"/>" alt="LloydAC" style="width:100%;height:40%">
        <div class="carousel-caption">
          <h5><span><strong>Cools Faster and Branded Winner</strong></span></h5>
          <p class="text-info"><mark><i><code><b>Beat The Heat!!!</b></code></i></mark></p>
        </div>
      </div>

      <div class="item">
        <img class="img-responsive" src="<c:url value="/resources/images/haier.jpg"/>" alt="HaierAC" style="width:100%;height:40%">
        <div class="carousel-caption">
             <h4><span><strong>Specially Designed Eco-Friendly</strong></span></h4>
          <p class="text-info"><mark><i><code><b>Creatively Innovative</b></code></i></mark></p>
        </div>
      </div>
    
      <div class="item">
       <img class="img-responsive" src="<c:url value="/resources/images/bose.jpg"/>" alt="BoseAC" style="width:100%;height:40%">
        <div class="carousel-caption">
          <h3><strong>BOSE Like A BOSS</strong></h3>
          <p class="text-info"><mark><i><code><b>Feel The Change!!!</b></code></i></mark></p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>




