<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!--
	Phantom by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<spring:url value="../resources/css/main.css" var="mainCss" />
<link rel="stylesheet" href="${mainCss}" />

<title>${book.title}</title>
<meta charset="utf-8" />
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<meta name="viewport" content="width=device-width, initial-scale=1" />
<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
</head>
<body>
	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<div class="inner">

				<!-- Logo -->
				<a href="<c:url value="/index"/>" class="logo"> <span class="symbol"><img
						src="../resources/images/logo.svg" alt="" /></span><span
					class="title">Aleaxiandriapp</span>
				</a>

				<!-- Nav -->
				<nav>
					<ul>
						<li><a href="#menu"><spring:message code="menu.title"></spring:message></a></li>
					</ul>
				</nav>

			</div>
		</header>

		<!-- Menu -->
		<nav id="menu">
			<div class="box alt">
				<div class="row uniform">

					<div class="2u">
						<span class="image fit "> <a href="book?id=${book.bookId}&language=de"> <img
								src="../resources/images/germany.png" alt="" />
						</a>
						</span>
					</div>
					<div class="2u">
						<span class="image fit "> <a href="book?id=${book.bookId}&language=es"> <img
								src="../resources/images/spain.png" alt="" />
						</a>
						</span>
					</div>
					<div class="2u">
						<span class="image fit"> <a href="book?id=${book.bookId}&?language=en"> <img
								src="../resources/images/uk.png" alt="" />
						</a>
						</span>
					</div>

					<div class="2u">
						<span class="image fit"> <a href="book?id=${book.bookId}&?language=en"> <img
								src="../resources/images/basque.png" alt="" />
						</a>
						</span>
					</div>

				</div>
			</div>


			<h2>
				<spring:message code="menu.title"></spring:message>
			</h2>
			<ul>
				<li><a href="<c:url value="/index"/>"><spring:message code="menu.home"></spring:message></a></li>
				<li><a href="<c:url value="/index"/>"><spring:message
							code="menu.books"></spring:message></a></li>
				<li><a href="<c:url value="/booklist"/>"><spring:message
							code="menu.readinglist"></spring:message></a></li>

				<li><a href="<c:url value="/"/>"><spring:message
							code="menu.logout"></spring:message></a></li>

			</ul>
		</nav>

		<!-- Main -->
		<div id="main" ng-app="bookListApp">
			<div class="inner">
				

			</div>
			<div class="6u 12u$(medium) inner" id="main" ng-controller="bookListCtrl" ng-init="initBookListId('${bookListId}')">

				<h3>Details</h3>
				<table>
				<tr ng-repeat="bookItem in bookList.bookItems">
				
					<td>{{bookItem.book.title}}</td>
					<td><a href="#" class="label label-danger" ng-click="removeFromBookList(bookItem.book.bookId)"> <span
							class="glyphicon glyphicon-remove" /></span> Remove
					</a></td>
				</tr>
				 </table>
			</div>
		</div>

		<!-- Footer -->
		<footer id="footer">
			<div class="inner" >

				<ul class="copyright">
					<li>&copy; Untitled. All rights reserved</li>
					<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
				</ul>
			</div>
		</footer>

	</div>

	<!-- Scripts -->

	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.1/angular.min.js"></script>
	<script src="../resources/js/controller.js"></script>
	
	<script type="text/javascript"
		src="../resources/js/jquery.min.js"></script>
	<script type="text/javascript"
		src="../resources/js/skel.min.js"></script>
	<script type="text/javascript" src="../resources/js/util.js"></script>
	<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
	<script type="text/javascript" src="../resources/js/main.js">
		
	</script>

</body>
</html>