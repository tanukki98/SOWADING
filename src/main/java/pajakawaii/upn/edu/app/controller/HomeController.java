package pajakawaii.upn.edu.app.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import pajakawaii.upn.edu.app.dao.AvesDao;
import pajakawaii.upn.edu.app.model.Ave;

@Controller
//@RequestMapping("/mantenedorHome")
public class HomeController {
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String irHome() {
		System.out.println("Entra al controlador home");
		return "MantenedorHome/home";
	}
	@RequestMapping(value="/usuarioss", method=RequestMethod.GET)
	public String irUsuario() {
		return "MantenedorUsuario/usuario";
	}
	@RequestMapping(value="/sidebar",method=RequestMethod.GET)
	public 	String irSide() {
		return "includes/SideBar";
	}
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mostrarPrincipal() {
		return "MantenedorHome/home";
	}
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String searchBirdorRegion() {
		
		return "search";
	}
	
	
	

}
