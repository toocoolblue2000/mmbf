<#macro layout title="LoanStar Title">
<!doctype html>
<html>
<head>
	<title>MMBF Loan Star - ${title}</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="css/bootstrap.css" />
	<link rel="stylesheet" href="css/custom/layout.css" />
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.js"></script>
</head>
<body>
	<div class="container">
		<header>
		   <#include "header.ftl"/>
		</header>
		<nav>
		  <#include "nav.ftl"/>
		</nav>
		<article>
		  <#nested/>
		</article>
		<footer>
			<#include "footer.ftl"/>
		</footer>
	</div>
</body>
</html>
</#macro>