<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html;
      charset=ISO-8859-1">

<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">



<title>Products</title>
</head>
<body>
	<section>
		<div class="pull-right" style="padding-right: 50px">
			<a href="?language=en">English</a>|<a
				href="?language=nl">Dutch</a>|<a
				href="?language=es">Spanish</a>|
				<a href="<c:url value="/logout" />">Logout</a>
            
		</div>
	</section>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
				<p>Add products</p>
			</div>
		</div>
	</section>
	<section class="container">

		<form:form method="POST" modelAttribute="newCustomer"
			class="form-horizontal">

			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="customerId"><spring:message
						code="addCustomer.form.customerId.label" /></label>
				<div class="col-lg-10">
					<form:input id="customerId" path="customerId" type="text"
						class="form:input-large" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="name"><spring:message
						code="addCustomer.form.name.label" /></label>
				<div class="col-lg-10">
					<form:input id="name" path="name" type="text"
						class="form:input-large" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="adress">
				<spring:message
						code="addCustomer.form.adress.label" />
				</label>
				<div class="col-lg-10">
					<form:input id="adress" path="adress" type="text"
						class="form:input-large" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="noOfOrdersMade">
				<spring:message
						code="addCustomer.form.noOfOrdersMade.label" />
				</label>
				<div class="col-lg-10">
					<form:input id="noOfOrdersMade" path="noOfOrdersMade" type="number"
						class="form:input-large" />
				</div>
			</div>
			
			

			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<input type="submit" id="btnAdd"
						class="btn
                         btn-primary" value="Add" />
				</div>
			</div>


		</form:form>


	</section>
</body>
</html>