<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<script type="text/javaScript" language="javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<select id="year">
	<option value="20"> 2020 </option>
	<option value="21"> 2021 </option>
	<option value="22"> 2022 </option>
</select>
<select id="month">
	<option value="01"> 01 </option>
	<option value="02"> 02 </option>
	<option value="03"> 03 </option>
	<option value="04"> 04 </option>
	<option value="05"> 05 </option>
	<option value="06"> 06 </option>
	<option value="07"> 07 </option>
	<option value="08"> 08 </option>
	<option value="09"> 09 </option>
	<option value="10"> 10 </option>
	<option value="11"> 11 </option>
	<option value="12"> 12 </option>
</select>
<span id="total"></span>
<table id="tbl"></table>
<script id="temp" type="text/x-handlebars-template">
	{{#each .}}
		<tr>
			<td>{{day}}</td>
		</tr>
	{{/each}}
</script>
</body>
<script>

getList();

function getList() {
	let year = $("#year").val();
	let month = $("#month").val();
	let date = year +"/"+ month;
	$.ajax({
		type:"get",
		url:"day.json",
		data:{"date":date},
		success:function(data) {
			var temp = Handlebars.compile($("#temp").html());
			 $("#tbl").html(temp(data));
			 alert(keyword);
		}
	});
}

$("#year").change(function() {
	getList();
});

$("#month").change(function() {
	getList();
});
</script>
</html>