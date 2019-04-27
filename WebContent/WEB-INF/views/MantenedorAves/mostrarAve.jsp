<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html SYSTEM "about:legacy-compat">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta charset="ISO-8859-1">
 <spring:url value="/resources" var="urlPublic"/>
 <spring:url value="/MantenedorAves/editar" var="urlEditarAve"/>
 <spring:url value="/MantenedorAves/eliminar" var="urlEliminarAve"/>
 
 
 

			
			
 <!-- Custom fonts for this template-->
  <link href="${urlPublic }/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Page level plugin CSS-->
  <link href="${urlPublic }/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="${urlPublic }/css/sb-admin.css" rel="stylesheet">
</head>
<body>
	<div id="wrapper">
	<jsp:include page="../includes/SideBar.jsp"></jsp:include>
	<div id="content-wrapper" class="d-flex flex-column">
	<style>p {
	padding-left:15%; margin-right:40px;
	
	
	}
	ul.ex1 {
		  
		  padding-right: 15%;
		}
	</style>
	<ul class="ex1">
	<div id="content">
	
		
		<table  border="10"  class="table table-striped table-bordered table-hover">
			<thead>
			<tr><th>ID</th><th>Nombre Comun</th><th>Nombre Cientifico</th><th>peso</th><th>Tamaño</th><th>Opciones</th>
			
			</tr>
		</thead>	
		<tbody>
			
				<tr>
				<td width="10%">${Vave.avesID}</td>
				<td width="10%">${Vave.nombre_comun}</td>
				<td width="10%">${Vave.nombre_cientifico}</td>
				<td width="10%">${Vave.peso}</td>
				<td width="10%">${Vave.tamanio}</td>
				<td width="10%">
				<a href="${urlEditarAve}/${Vave.avesID}"
					   class="btn btn-info">
						<i class="fas fa-edit" style="margin-right:4px"></i>
						Editar
						</a>
						
						<a href="${urlEliminarAve}?avesID=${Vave.avesID}"
						class="btn btn-danger">
						<i class="fas fa-trash" style="margin-right:4px"></i>
						Eliminar
				</a>
				
				</td>
				
			
				</tr>			
			
		</tbody>
			</table>
	
		
	</div>
	</ul>
	<jsp:include page="../includes/footer.jsp"></jsp:include>	
	</div>
	
	</div>
	
	
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