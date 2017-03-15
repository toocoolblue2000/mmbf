<#macro pagelayout title="LoanStar Title">
<!doctype html>
<html lang="en">
<head>
	<title>MMBF Loan Star - ${title}</title>
	<#include "/layout/imports.ftl" />
	<link rel="stylesheet" href="css/custom/layout.css">
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-fixed-top navbar-dark bg-primary">
		  <#include "nav.ftl"/>
		</nav>
		<article>
		  <#nested/>
		</article>
		<footer class="footer navbar-default navbar-fixed-bottom">
			<#include "footer.ftl"/>
		</footer>
	</div>
</body>
</html>
</#macro>