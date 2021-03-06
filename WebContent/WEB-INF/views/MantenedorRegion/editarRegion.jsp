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
 <spring:url value="/MantenerdorAves/listar" var="urlListarAve"/>
 
 
 

			
			
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
			<style>p {padding-left:15%;}</style>
			<ul>
			<div id="content">
		
			
		<h1 class="h3 mb-1 text-gray-800">Editar Ave</h1>
					<p class="mb-4">
						<br />
						<div><strong>Ingrese los nuevos datos del ave</strong> </div>
						<br /> <br />
						
					</p>
		
		<form class="user" action="${urlActualizar}" method="post">
					<c:forEach var="dato" items="${aspirante}">	
						<div class="form-group row">
							<div class="col-sm-6 mb-3 mb-sm-0 form-group">
								<label>Nombres:</label>
								<input value="${dato.nombres}" name="nombres" id="nombres" type="text" required class="form-control form-control-user" placeholder="ex: Sergio Gerardo">

							</div>
							<div class="col-sm-6 mb-3 mb-sm-0 form-group">
								<label>Apellidos:</label>
								<input value="${dato.apellidos}" name="apellidos" id="apellidos" type="text" required class="form-control form-control-user" placeholder="ex: Lopez Gomez">
							</div>
						</div>
					
						<div class="form-group row">
							<div class="col-sm-6 mb-3 mb-sm-0 form-group">
								<label>DNI:</label>
								<input value="${dato.DNI}" name="dni" id="dni" type="text" required class="form-control form-control-user" placeholder="ex: 00964812">

							</div>
							<div class="col-sm-6 mb-3 mb-sm-0 form-group">
								<label>Estatura:</label>
								<input value="${dato.estatura}" name="estatura" id="estatura" type="" required class="form-control form-control-user" placeholder="ex: 1.55" min=0>
							</div>
						</div>

						<div class="form-group row">
							<div class="col-sm-6 mb-3 mb-sm-0 form-group">
								<label>Codigo de Promocion:</label>
								<input value="${dato.idPromocion}" name="idpromo" id="idpromo" type="number" required class="form-control form-control-user" placeholder="ex: 1" min=0>

							</div>
							<div class="col-sm-6 mb-3 mb-sm-0 form-group">
								<label>Fecha de Nacimiento:</label>
								<input value="" name="fnacimiento" id="fnacimiento" type="date" required class="form-control form-control-user">
							</div>
						</div>
						<!-- MANDO ID DE ASPIRANTE ESCONDIDO -->
						<input name="idAspirante" value="${dato.idAspirante}" style="visibility:hidden">
						
						<div class="form-group">
							<button type="submit" class="btn btn-primary btn-sm">
								<i class="fas fa-save" style="margin-right:4px"></i>
								Guardar
							</button>
						</div>
					</c:forEach>
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