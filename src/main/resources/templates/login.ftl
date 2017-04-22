<!doctype html>
<html lang="en">
<head>
	<title>MMBF Loan Star - Login</title>
</head>
<body>
	<#include "/layout/imports.ftl" />
	<link rel="stylesheet" href="css/custom/login.css" />

	<div id="fullscreen_bg" class="fullscreen_bg"></div>

	<div class="container">

		<form name="loginForm" action="<@spring.url '/login' />" method="post" class="col-md-offset-2 col-md-8">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div class="logo-white-trans"></div>
			<h1 class="white-text">Sign In</h1>
			<#if RequestParameters.error??>
				<div class="alert alert-danger alert-dismissable" align="center">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					<strong>Invalid Login!</strong><br>Invalid username or password
				</div>
			<#elseif RequestParameters.logout??>
				<div class="alert alert-info alert-dismissable" align="center">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				  	<strong>Logged out!</strong><br>You have Logged out of Loanstar
				</div>
			</#if>
			<div class="md-form">
                <i class="fa fa-user prefix white-text"></i>
                <input id="username" name="username" type="text" class="form-control white-text" autocomplete='off'>
                <label for="username" class="white-text">Username</label>
            </div>
            <div class="md-form">
			    <i class="fa fa-lock prefix white-text"></i>
			    <input id="password" name="password" type="password" class="form-control white-text">
			    <label for="password" class="white-text">Password</label>
			</div>
            
			<button class="btn btn-primary waves-effect pull-right" type="submit">Sign In</button>
		</form>

	</div>
</body>
</html>