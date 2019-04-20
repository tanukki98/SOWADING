<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!DOCTYPE html SYSTEM "about:legacy-compat">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta charset="ISO-8859-1">
 <spring:url value="/resources" var="urlPublic"/>
<link rel="stylesheet"
		href="${urlPublic}/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
		href="${urlPublic}/bootstrap/css/theme.css">
<link rel="stylesheet"
		href="${urlPublic}/bootstrap/css/theme.css">
		<script type="javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
			<script src="${urlPublic}/bootstrap/js/popper.min.js"  ></script>
			<script type="javascript" src="${urlPublic}/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="../includes/SideBarTop.jsp"></jsp:include>
	<table class="table table-striped table-bordered table-hover">
			<thead>
			<tr>
				<th>ID</th><th>nombre Comun</th><th>nombre Cientifico</th><th>peso</th><th>tamaño</th>
			</tr>
		</thead>	
		<tbody>
			<c:forEach items="${Vaves}" var="dato">
				<tr>
					<td>${dato.avesID }</td>
					<td>${dato.nombre_comun }</td>
					<td>${dato.nombre_cientifico }</td>
					<td>${dato.peso }</td>
					<td>${dato.tamanio }</td>
					
					
				
				</tr>			
			</c:forEach>
		</tbody>
			
			
			
			</table>
			<jsp:include page="../includes/SideBarBot.jsp"></jsp:include>	
</body>
</html>