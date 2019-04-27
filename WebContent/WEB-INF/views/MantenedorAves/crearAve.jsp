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
 <spring:url value="/MantenedorAves/guardar" var="urlGuardarAve"/>
 
 
 

			
			
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
	<style>p {padding-left:15%; padding-right:40px;}</style>
	<ul>
	<div id="content">

<h1 class="h3 mb-1 text-gray-800">Nuevo Ave</h1>
		
		
					 
					
					<p class="mb-4">
						<br />
						<div>Ingrese los datos del nuevo registro de Ave</div>
						<br /> <br />
						
						
					</p>

					<form class="user" action="${urlGuardarAve}" method="post">

						<div class="form-group row">
							<div class="col-3">
								<label>ID:</label>
								<input name="avesID" id="avesID" type="number" required class="form-control form-control-user" >

							</div>
							<div class="col-3">
								<label>Nombre Cientifico:</label>
								<input name="nombre_cientifico" id="nombre_cientifico" type="text" required class="form-control form-control-user" >
							</div>
						</div>

						<div class="form-group row">
							<div class="col-3">
								<label>Nombre Comun:</label>
								<input name="nombre_comun" id="nombre_comun" type="text" required class="form-control form-control-user">

							</div>
							<div class="col-3">
								<label>Peso:</label>
								<input name="peso" id="peso" type="number" required class="form-control form-control-user" step="any" min="0"  >
							</div>
						</div>

						<div class="form-group row">
							<div class="col-3">
								<label>Tamaño:</label>
								<input name="tamanio" id="tamanio" type="number" required class="form-control form-control-user" step="any" min="0">

							</div>
							
						</div>

						<div class="form-group">
							<button type="submit" class="btn btn-primary btn-sm">
								<i class="fas fa-save" style="margin-right:4px"></i>
								Guardar
							</button>
						</div>

					</form>
					
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