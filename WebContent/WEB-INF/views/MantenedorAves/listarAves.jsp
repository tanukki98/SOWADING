<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta charset="ISO-8859-1">
 <spring:url value="/resources" var="urlPublic"/>
 <spring:url value="/MantenedorAve/save" var="urlForm"></spring:url>
  <spring:url value="/MantenedorAve/buscar" var="urlSearch"></spring:url>
			
			
 <!-- Custom fonts for this template-->
  <link href="${urlPublic }/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Page level plugin CSS-->
  <link href="${urlPublic }/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="${urlPublic }/css/sb-admin.css" rel="stylesheet">
  
  
</head>
<body>
		<jsp:include page="../includes/SideBarTop.jsp"></jsp:include>
	
		
			<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h6 class="m-0 font-weight-bold text-primary">Mantenedor Aspirante</h6>
						</div>
						<div class="card-body">
							<div class="table-responsive">
								<table id="tb_aspirante" class="table table-bordered" width="100%" cellspacing="0">
									<thead>
										<tr>
											<th>ID</th>
											<th>Nombre Comun</th>
											<th>Nombre Cientifico</th>
											<th>Peso</th>
											<th>Tamaño</th>
											
											<!--<th>Foto</th> -->
											
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${Modelaves}" var="dato">
											<tr>
												<td> ${dato.avesID} </td>
												<td> ${dato.nombre_cientifico} </td>
												<td> ${dato.nombre_comun} </td>
												<td> ${dato.peso} </td>
												
												<td> ${dato.tamanio}</td>
												<!-- <td style="width: 100px;">
									<img src="${urlPublic}/Imagenes/Empleados/empleado1.png" width="100%" height="10%" />
								</td> -->
												<td>
													<a href="${urlEditarAspirante}/${dato.idAspirante}"
													   class="btn btn-primary btn-sm">
														<i class="fas fa-edit" style="margin-right:4px"></i>
														Editar
													</a>
													<div class="my-2"></div>
													<a href="${urlEliminarAspirante}?idAsp=${dato.idAspirante}"
													   class="btn btn-primary btn-sm">
														<i class="fas fa-trash" style="margin-right:4px"></i>
														Eliminar
													</a>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
	
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