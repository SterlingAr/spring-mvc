<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html;
      charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<script 
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
<script src="/webstore/resources/js/controller.js"></script>

<title>Products</title>
</head>
<body>
	<section>
		<div class="pull-right" style="padding-right: 50px">
			<a href="product?id=${product.productId}&language=en">English</a>|<a
				href="product?id=${product.productId}&language=nl">Dutch</a>|<a
				href="product?id=${product.productId}&language=es">Spanish</a>

		</div>
	</section>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
			</div>
		</div>
	</section>
	<section class="container" ng-app="cartApp">
		<div class="row">
			<div class="col-md-5">
				<img
					src="<c:url value="/img/${product.productId}.png">
         </c:url>"
					alt="image" style="width: 100%" />
			</div>
			<div class="col-md-5">
				<h3>${product.name}</h3>
				<p>${product.description}</p>
				<p>
					<label for="productId"></label> <strong><spring:message
							code="product.productId.label" />: </strong>${product.productId}

				</p>
				<p>
					<label for="manufacturer"><strong><spring:message
								code="product.manufacturer.label">

							</spring:message></strong> : ${product.manufacturer}</label>

				</p>
				<p>
					<label for="category"> <strong><spring:message
								code="product.category.label" />: </strong> ${product.category}
					</label>

				</p>
				<p>
					<label for="unitsInStock"> <strong><spring:message
								code="product.unitsInStock.label" /></strong> : ${product.unitsInStock}
					</label>

				</p>
				<p>

					<a href="<spring:url value = "/manuals/${product.productId}.pdf"/>"
						class="btn btn-primary" target="_blank"
						<span class="glyphicon-info-sign glyphicon">
						<label for="productManual"><spring:message code="product.productManual.label" /></label>
						</span>>


					</a>
				</p>


				<h4>${product.unitPrice}
					<strong><label for="unitPrice"> <spring:message
								code="product.unitPrice.label" />
					</label></strong>
				</h4>
				<p ng-controller="cartCtrl">

					<a href="<spring:url value="/market/products" />"
						class="btn btn-default"> <span
						class="glyphicon-hand-left glyphicon"></span> <label for="back"><spring:message
								code="product.back.label" /></label>
					</a> <a href="#" class="btn btn-warning btn-large"
						ng-click="addToCart('${product.productId}')"> <span
						class="glyphicon-shopping-cart glyphicon"> </span> <label
						for="orderNow"><spring:message
								code="product.orderNow.label" /></label>
					</a> <a href="<spring:url value="/cart" />"
						class="btn btn-default"> <span
						class="glyphicon-hand-right glyphicon"></span> View Cart
					</a>

				</p>
			</div>
		</div>
	</section>
</body>
</html>