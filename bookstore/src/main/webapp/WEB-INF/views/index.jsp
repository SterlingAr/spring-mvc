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
<title>Phantom by HTML5 UP</title>
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
					class="title">Phantom</span>
				</a>

				<!-- Nav -->
				<nav>
					<ul>
						<li><a href="#menu">Menu</a></li>
					</ul>
				</nav>

			</div>
		</header>

		<!-- Menu -->
		<nav id="menu">
			<h2>Menu</h2>
			<ul>
				<li><a href="index.jsp">Home</a></li>
				<li><a href="generic.html">Ipsum veroeros</a></li>
				<li><a href="generic.html">Tempus etiam</a></li>
				<li><a href="generic.html">Consequat dolor</a></li>
				<li><a href="elements.html">Elements</a></li>
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
							</span> <a href="<spring:url value="/book?id=${book.bookId}" />">
								<h2>${book.title}</h2>
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
				<section>
					<h2>Follow</h2>
					<ul class="icons">
						<li><a href="#" class="icon style2 fa-twitter"><span
								class="label">Twitter</span></a></li>
						<li><a href="#" class="icon style2 fa-facebook"><span
								class="label">Facebook</span></a></li>
						<li><a href="#" class="icon style2 fa-instagram"><span
								class="label">Instagram</span></a></li>
						<li><a href="#" class="icon style2 fa-dribbble"><span
								class="label">Dribbble</span></a></li>
						<li><a href="#" class="icon style2 fa-github"><span
								class="label">GitHub</span></a></li>
						<li><a href="#" class="icon style2 fa-500px"><span
								class="label">500px</span></a></li>
						<li><a href="#" class="icon style2 fa-phone"><span
								class="label">Phone</span></a></li>
						<li><a href="#" class="icon style2 fa-envelope-o"><span
								class="label">Email</span></a></li>
					</ul>
				</section>
				<ul class="copyright">
					<li>&copy; Untitled. All rights reserved</li>
					<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
				</ul>
			</div>
		</footer>

	</div>

	<!-- Scripts -->
	


<script type="text/javascript" src="/bookstore/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="/bookstore/resources/js/skel.min.js"></script>
<script type="text/javascript" src="/bookstore/resources/js/util.js"></script>
<script type="text/javascript" src="/bookstore/resources/js/main.js"> </script>


</body>
</html>