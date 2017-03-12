<#macro pagelayout title="LoanStar Title">
<!doctype html>
<html>
<head>
	<title>MMBF Loan Star - ${title}</title>
	<#include "/layout/imports.ftl" />
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-default navbar-fixed-top">
		  <#include "nav.ftl"/>
		</nav>
		<article>
		  <#nested/>
		</article>
		<footer class="footer navbar-fixed-bottom">
			<#include "footer.ftl"/>
		</footer>
	</div>
</body>
</html>
</#macro>