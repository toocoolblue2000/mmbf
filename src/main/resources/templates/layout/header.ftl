<div>
	<H1> MMBF Loan Star</h1>
	<#assign security=JspTaglibs["http://www.springframework.org/security/tags"] />
	<@security.authorize>
		<p style="padding-right: 20px;">Logged in as ${username!"Anonymous" }</p>
	</@security.authorize>
</div>