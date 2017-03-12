<#macro pagelayout title="LoanStar Title">
<!doctype html>
<html>
<head>
	<title>MMBF Loan Star - ${title}</title>
	<#include "/layout/imports.ftl" />
	<link rel="stylesheet" href="css/custom/layout.css">
	<script>
	$(window).scroll(function() {
	  if ($(document).scrollTop() > 50) {
	    $('nav').addClass('shrink');
	    $('#logoutButton').addClass('btn-sm');
	  } else {
	    $('nav').removeClass('shrink');
	    $('#logoutButton').removeClass('btn-sm');
	  }
	});
	</script>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-default navbar-fixed-top">
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