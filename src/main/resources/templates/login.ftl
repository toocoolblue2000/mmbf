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
</head>
<body onload="document.loginForm.username.focus();">

	<div id="fullscreen_bg" class="fullscreen_bg"></div>

	<div class="container">

		<form class="form-signin" name="loginForm" action="/login" method="post">
			<h1 class="form-signin-heading text-muted">Sign In</h1>
			<input type="text" class="form-control" placeholder="User Id" required autofocus> 
			<input type="password" class="form-control" placeholder="Password" required>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign In</button>
		</form>

	</div>
</body>
</html>