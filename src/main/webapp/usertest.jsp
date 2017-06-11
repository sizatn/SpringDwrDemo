<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>user test</title>
	<script type='text/javascript' src='js/jquery-1.9.1.min.js'></script>
	<script type='text/javascript' src='/springdwrdemo/dwr/engine.js'></script>
	<script type='text/javascript' src='/springdwrdemo/dwr/util.js'></script>
  	<script type='text/javascript' src='/springdwrdemo/dwr/interface/userController.js'></script>
    <script type="text/javascript">
    	$(function(){
	    	$('#getData').click(function() {
	    		userController.getUser({callback:showData})}
	    	);
    	});
    	
    	function showData(data) {  
    		alert(dwr.util.toDescriptiveString(data, 3));
        }
	</script>
</head>
<body>
	<input id="getData" type="button" value="get data" />
	<div id="returnmessage"></div>
</body>
</html>