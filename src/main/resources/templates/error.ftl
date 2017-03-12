<#import "/layout/defaultLayout.ftl" as layout>
<@layout.pagelayout title="Home">
  	<div id="page">
	    <h1>Error</h1>
	    <h2>Sorry the operation you tried is not successful</h2>
	    <h4>There may be an error, or may not have access to this operation</h4>
	    
	    <p>Error message:</p>
	    <p><#if exception?has_content>${exception.message}</#if></p>
	</div>
</@layout.pagelayout>