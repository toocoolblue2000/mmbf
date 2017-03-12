<#macro pagelayout title="LoanStar Title">
<!doctype html>
<html>
<head>
	<title>MMBF Loan Star - ${title}</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link type="text/css" href="css/bootstrap.css" rel="stylesheet" />
    <link type="text/css" href="css/custom/layout.css" rel="stylesheet" />    
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<#import "/spring.ftl" as spring/>
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