<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 기업등록 </title>
<style>
	#divTotal {width:100%; height:100%;}
	#divPage{width:600px; text-align:center; margin:auto; margin-top:300px;} 
	#tblLogin{margin-left:17%; margin-right:17%; width:60%; height:100px; padding-left:3%; padding-right:3%;}
	#backgroundImage {width:100%; height:100%;}
</style>
</head>
<body>
<h2> [기업등록] </h2>
<div id="header">
	<img src="http://placehold.it/150x150">
</div>
<div id="divTotal">
<img src="http://placehold.it/1000x1000" id="backgroundImage">
	<div id="divPage">
		<table id="tblLogin">
			<tr>
				<td><img src="http://placehold.it/300x180" id="btnLogin"><td>
			</tr>
		</table>
	</div>
</div>
<div style="position:fixed; bottom:10px; right:10px;">
	<a href="#header"><input type="button" value="TOP"></a>
</div>
</body>
<script>
	$("#btnLogin").on("click", function() {
		alert("기업등록");
	});
</script>
</html>