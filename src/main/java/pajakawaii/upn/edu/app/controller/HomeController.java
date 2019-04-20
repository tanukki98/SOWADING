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
		return "MantenedorHome/home";
	}
	@RequestMapping(value="/sidebar",method=RequestMethod.GET)
	public 	String irSide() {
		return "includes/SideBar";
	}
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mostrarPrincipal() {
		return "/home";
	}
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String searchBirdorRegion() {
		
		return "search";
	}
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String mostrarListaAves(Model model) {
		
		List<Ave> aves = getLista();//new LinkedList<>();
		//peliculas.add("A"); //peliculas.add("B"); //peliculas.add("C");
		model.addAttribute("Vaves",aves);
		
		return "MantenedorAves/ave";
	}
	
	private List<Ave> getLista() {
		
		List<Ave> lista = null;
		try {
			lista = new LinkedList<Ave>();
			
			Ave p = new Ave();
			
			p.setAvesID(1);
			p.setNombre_cientifico("Avus primitus");
			p.setNombre_comun("Pajarraco");
			p.setPeso((float)3.3);
			p.setTamanio(30);
			
			Ave p2 = new Ave();
			
			p2.setAvesID(2);
			p2.setNombre_cientifico("Avus primitus2");
			p2.setNombre_comun("Pajarraco2");
			p2.setPeso((float)3.3);
			p2.setTamanio(30);	
			lista.add(p);
			lista.add(p2);
			
			return lista;
		}
		catch(Exception ex){
			return null;
		}
	}
}
