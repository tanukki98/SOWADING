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

	<spring:url value="/MantenedorAves/listar" var="urllistarAve"/>
	<spring:url value="/MantenedorAves/crear" var="urlcrearAve"/>
	<spring:url value="/MantenedorRegion/crear" var="urlcrearRegion"/>
	<spring:url value="/MantenedorRegion/listar" var="urllistarRegion"/>
	<spring:url value="/MantenedorUsuario/listar" var="urllistarUsuario"/>
	<spring:url value="/home" var="urlhome"/>

  
  	

    <!-- Sidebar -->
    <ul class="sidebar navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="${urlhome }">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>PAJARIk</span>
        </a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="SearchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <i class="fas fa-fw fa-folder"></i>
          <span>Explorar</span>
        </a>
        <div class="dropdown-menu" aria-labelledby="SearchDropdown">          
          <a class="dropdown-item" href="${urllistarAve }">Buscar por Aves</a>
          <a class="dropdown-item" href="${urllistarRegion }">Buscar por regiones</a>
          <a class="dropdown-item" href="${urllistarUsuario }">Lista de Usuarios</a>        
        </div>
      </li>
      <li class="nav-item dropdown">
       <a class="nav-link dropdown-toggle" href="#" id="MantenedorAvesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         <i class="fas fa-fw fa-folder"></i>
          <span>Administrador</span>
        </a>
        <div class="dropdown-menu" aria-labelledby="MantenedorAvesDropdown">          
          <a class="dropdown-item" href="${urlcrearAve }">Crear Ave</a>
          <a class="dropdown-item" href="${urlcrearRegion }">Crear Region</a>        
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="tables.html">
          <i class="fas fa-fw fa-table"></i>
          <span>tercera opcion</span></a>
      </li>
    </ul>