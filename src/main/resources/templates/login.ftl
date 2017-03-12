<!DOCTYPE html>
<html>
<head>
<title>MMBF Loan Star - Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/custom/login.css">
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/bootstrap.js" type="text/javascript"></script>
<#import "/spring.ftl" as spring/>
</head>
<body onload="document.loginForm.username.focus();">

	<div id="fullscreen_bg" class="fullscreen_bg"></div>

	<div class="container">

		<form class="form-signin" name="loginForm" action="/loanstar/login" method="post">
			<h1 class="form-signin-heading text-muted">Sign In</h1>
			<#if RequestParameters.error??>
				<div class="alert alert-danger" align="center">
				  <strong>Invalid Login!</strong><br>Invalid username or password
				</div>
			<#elseif RequestParameters.logout??>
				<div class="alert alert-info" align="center">
				  <strong>Logged out!</strong><br>You have Logged out of Loanstar
				</div>
			</#if>
			
			<input id="username" name="username" type="text" class="form-control" placeholder="Username" required autofocus> 
			<input id="password" name="password" type="password" class="form-control" placeholder="Password" required>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign In</button>
		</form>

	</div>
</body>
</html>