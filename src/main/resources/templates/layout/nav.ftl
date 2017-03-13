<div class="container">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-collapse">
			<span class="icon-bar"></span> <span class="icon-bar"></span> <span
				class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="<@spring.url '/home' />"> <strong>Loan</strong>star
		</a>
	</div>
	<div id="navbar" class="navbar-collapse collapse">
		<ul class="nav navbar-nav">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" role="button" aria-haspopup="true"
				aria-expanded="false">Entry <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">Pawn Ticket</a></li>
					<li><a href="#">Loan Receipt</a></li>
					<li><a href="#">Redemption</a></li>
					<li role="separator" class="divider"></li>
					<li><a href="#">Stock Movement</a></li>
					<li><a href="#">On Account</a></li>
					<li role="separator" class="divider"></li>
					<li><a href="#">Voucher</a></li>
				</ul>
			</li>
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" role="button" aria-haspopup="true"
				aria-expanded="false">Master <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">Party Type</a></li>
					<li><a href="#">Item</a></li>
					<li><a href="#">Purity</a></li>
					<li><a href="#">Address Proof</a></li>
					<li><a href="#">ID Proof</a></li>
					<li><a href="#">Source</a></li>
					<li><a href="#">Location</a></li>
					<li><a href="#">Scheme</a></li>
					<li><a href="#">Scheme Detail</a></li>
					<li><a href="#">On Account</a></li>
					<li role="separator" class="divider"></li>
					<li><a href="#">Area</a></li>
					<li><a href="#">Ledger</a></li>
					<li><a href="#">Ledger Group</a></li>
				</ul>
		    </li>
		    <li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" role="button" aria-haspopup="true"
				aria-expanded="false">Features <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">General Setup</a></li>
					<li><a href="#">Account Setup</a></li>
					<li><a href="#">Loan Setup</a></li>
					<li><a href="#">Voucher Series</a></li>
					<li><a href="#">Security Type</a></li>
					<li><a href="#">User</a></li>
				</ul>
		    </li>
			<li><a href="#about">Admin</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#">Nithin, Nivas</a></li>
			<li class="active">
				<form name="logoutForm" class="navbar-form pull-right" action="<@spring.url '/logout' />" method="post">
					<button id='logoutButton' type=submit href="#" class="btn btn-success">
						Logout <span class="glyphicon glyphicon-log-out"></span>
					</button>
				</form>
			</li>
		</ul>
	</div>
</div>