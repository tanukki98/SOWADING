<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta charset="ISO-8859-1">
 <spring:url value="/resources" var="urlPublic"/>

			
			
 <!-- Custom fonts for this template-->
  <link href="${urlPublic }/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Page level plugin CSS-->
  <link href="${urlPublic }/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="${urlPublic }/css/sb-admin.css" rel="stylesheet">
  

</head>
<body>
<jsp:include page="../includes/SideBarTop.jsp"></jsp:include>
	<table class="table table-striped table-bordered table-hover">
			<thead>
			<tr><th>UsuarioId</th><th>Nombres</th><th>Apellidos</th><th>Nacionalidad</th><th>Sexo</th>
			<th>Usuario</th><th>Contrasenia</th>
			</tr>
		</thead>	
		<tbody>
			<c:forEach items="${Vusuario}" var="dato">
				<tr>
				<td>${dato.usuarioId}</td>
				<td>$[dato.nombres]</td>
				<td>$[dato.apellidos]</td>
				<td>$[dato.nacionalidad]</td>
				<td>$[dato.sexo]</td>
				<td>$[dato.usuario]</td>
				<td>$[dato.contrasenia]</td>	
			
				</tr>			
			</c:forEach>
		</tbody>
			</table>
			<jsp:include page="../includes/SideBarBot.jsp"></jsp:include>	
						 <!-- Bootstrap core JavaScript-->
		  <script src="${urlPublic }/vendor/jquery/jquery.min.js"></script>
		  <script src="${urlPublic }/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
		
		  <!-- Core plugin JavaScript-->
		  <script src="${urlPublic }/vendor/jquery-easing/jquery.easing.min.js"></script>
		
		  <!-- Page level plugin JavaScript-->
		  <script src="${urlPublic }/vendor/chart.js/Chart.min.js"></script>
		  <script src="${urlPublic }/vendor/datatables/jquery.dataTables.js"></script>
		  <script src="${urlPublic }/vendor/datatables/dataTables.bootstrap4.js"></script>
				
</body>
</html>