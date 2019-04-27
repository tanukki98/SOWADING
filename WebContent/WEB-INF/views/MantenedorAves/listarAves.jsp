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
		
			<div class="card shadow mb-4">
						
						<div class="card-body">
							<div><!-- BUSQUEDA -->
							
							<form name='buscarAve'
      								  action="<c:url value='/MantenedorAves/buscarAve' />" method='POST'>
							<div>
						    <label for="avesID">ID de Ave:</label>
						    <input type="number" id="id" name="id">
						    <button class="btn btn-secondary pull-right" type="submit">Buscar</button>
						  </div>		  		  
						  
							</form>
							
							
							
							</div>
							</br></br>
						
						
							<div class="table-responsive">
								<table id="tb_aspirante" class="table table-bordered" width="100%" cellspacing="0">
									<thead>
										<tr>
											<th>ID</th>
											<th>Nombre Cientifico</th>
											<th>Nombre Comun</th>
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
											
												
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
	
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