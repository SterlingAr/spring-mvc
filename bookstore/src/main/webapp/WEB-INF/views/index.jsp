<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!--
	Phantom by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<spring:url value="/resources/css/main.css" var="mainCss" />
<title>Aleaxiandriapp</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<!--[if lte IE 8]><script src="/bookstore/resources/assets/js/ie/html5shiv.js"></script><![endif]-->
<link rel="stylesheet" href="${mainCss}" />
<!--[if lte IE 9]><link rel="stylesheet" href="/bookstore/resources/assets/css/ie9.css" /><![endif]-->
<!--[if lte IE 8]><link rel="stylesheet" href="/bookstore/resources/assets/css/ie8.css" /><![endif]-->

<!--[if lte IE 8]><script src="/bookstore/resources/assets/js/ie/respond.min.js"></script><![endif]-->
</head>
<body>
	<!-- Wrapper -->
	<div id="wrapper">


		<!-- Header -->
		<header id="header">
			<div class="inner">

				<!-- Logo -->
				<a href="index.html" class="logo"> <span class="symbol"><img
						src="/bookstore/resources/images/logo.svg" alt="" /></span><span
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
						<span class="image fit ">
							<a href="?language=de">
								<img src="/bookstore/resources/images/germany.png" alt="" />
							</a>
						</span>
					</div>
					<div class="2u">
						<span class="image fit ">
							<a href="?language=es">
								<img src="/bookstore/resources/images/spain.png" alt="" />
							</a>
						</span>
					</div>
					<div class="2u">
						<span class="image fit">
							<a href="?language=en">
								<img src="/bookstore/resources/images/uk.png" alt="" />
							</a>	
						</span>
					</div>
					
					<div class="2u">
						<span class="image fit">
							<a href="?language=en">
								<img src="/bookstore/resources/images/basque.png" alt="" />
							</a>	
						</span>
					</div>
			
				</div>
			</div>
		
		
			<h2>
				<spring:message code="menu.title"></spring:message>
			</h2>
			<ul>
				<li><a href="index.jsp"><spring:message code="menu.home"></spring:message></a></li>
				<li><a href="generic.html"><spring:message
							code="menu.books"></spring:message></a></li>
				<li><a href="login.jsp"><spring:message code="menu.login"></spring:message></a></li>
				<li><a href="generic.html"><spring:message
							code="menu.readinglist"></spring:message></a></li>
							
					<li><a href="<c:url value="/logout"/>"><spring:message
							code="menu.logout"></spring:message></a></li>
				
			</ul>
	
		

		</nav>

		<!-- Main -->
		<div id="main">
			<div class="inner">
				<header>
					<h1>
						This is Phantom, a free, fully responsive site<br /> template
						designed by <a href="http://html5up.net">HTML5 UP</a>.
					</h1>
					<p>Etiam quis viverra lorem, in semper lorem. Sed nisl arcu
						euismod sit amet nisi euismod sed cursus arcu elementum ipsum arcu
						vivamus quis venenatis orci lorem ipsum et magna feugiat veroeros
						aliquam. Lorem ipsum dolor sit amet nullam dolore.</p>
				</header>
				<section class="tiles">


					<c:forEach items="${books}" var="book">

						<article class="style1">
							<span class="image"> <img
								src="/bookstore/resources/images/${book.bookId}.jpg" alt="" />
							</span> <a href="<spring:url value="/book?id=${book.bookId}" />"/>

								<div class="content">
									<p>${book.description}</p>
								</div>
							</a>
						</article>


					</c:forEach>

				</section>
			</div>
		</div>

		<!-- Footer -->
		<footer id="footer">
			<div class="inner">
				<section>
					<h2>Get in touch</h2>
					<form method="post" action="#">
						<div class="field half first">
							<input type="text" name="name" id="name" placeholder="Name" />
						</div>
						<div class="field half">
							<input type="email" name="email" id="email" placeholder="Email" />
						</div>
						<div class="field">
							<textarea name="message" id="message" placeholder="Message"></textarea>
						</div>
						<ul class="actions">
							<li><input type="submit" value="Send" class="special" /></li>
						</ul>
					</form>
				</section>
				
				<ul class="copyright">
					<li>&copy; Untitled. All rights reserved</li>
					<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
				</ul>
			</div>
		</footer>

	</div>

	<!-- Scripts -->



	<script type="text/javascript"
		src="/bookstore/resources/js/jquery.min.js"></script>
	<script type="text/javascript"
		src="/bookstore/resources/js/skel.min.js"></script>
	<script type="text/javascript" src="/bookstore/resources/js/util.js"></script>
	<script type="text/javascript" src="/bookstore/resources/js/main.js">
		
	</script>


</body>
</html>