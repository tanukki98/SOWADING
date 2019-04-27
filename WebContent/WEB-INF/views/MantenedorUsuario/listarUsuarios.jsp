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
	<div id="content">
		
			<div class="card shadow mb-4">
						
						<div class="card-body">
						
							</br></br>
						
						
							<div class="table-responsive">
								<table id="tb_usuarios" class="table table-bordered" width="100%" cellspacing="0">
									<thead>
										<tr>
											<th>ID</th>
											<th>Nombre de Usuario</th>
											<th>Nombres</th>
											<th>Apellidos</th>
											<th>Sexo</th>
											<th>Nacionalidad</th>
											<th>esAdmin</th>
											
											
											
											
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${Modelusuarios}" var="dato">
											<tr>
												<td> ${dato.usuarioID} </td>
												<td> ${dato.nombreu} </td>
												<td> ${dato.nombres} </td>
												<td> ${dato.apellidos} </td>
												<td> ${dato.sexo} </td>
												<td> ${dato.nacionalidad} </td>
												<td> ${dato.esAdmin} </td>
												
												
												
											
												
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
	
		</div>
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