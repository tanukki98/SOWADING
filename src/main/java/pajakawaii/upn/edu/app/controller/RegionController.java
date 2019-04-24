package pajakawaii.upn.edu.app.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pajakawaii.upn.edu.app.dao.RegionDao;
import pajakawaii.upn.edu.app.model.Region;




@Controller
@RequestMapping("/MantenedorRegion")
public class RegionController {
	@Autowired//INSTANCIA AUTOMATICAMENTE SIGUIENDO EL BEAN 
	private RegionDao regiondao;
	//Listar
	@GetMapping(value="/listar")
	public String listar(Model model) {
		
		List<Region> regiones = new ArrayList<Region>();
				regiones=regiondao.listarRegiones();
		
		model.addAttribute("Modelregiones",regiones);
		
		
		return "MantenedorRegion/listarRegiones";
		
		
		
	}
	
	/*@RequestMapping(value="/aves", method=RequestMethod.GET)
	public String irAve() {
		
		
		return "ave";
	}
	*/
	/*@RequestMapping(value="buscarAve", method=RequestMethod.GET)
	public String buscarAve() {
		
		
		return "MantenedorAves/buscarAve";
	}*/
	

	
	
	@RequestMapping (value="/buscarRegion", method=RequestMethod.POST)
	public String buscarRegion(Model model,			
			@RequestParam("id") int id) {
		
		
		try {
			
			
			Region region = regiondao.busquedaRegion(id);
			
			model.addAttribute("Vregion",region);			
		}
		catch (Exception ex) {
			System.out.print(ex.toString());;
			
			return "redirect:/MantenedorRegion/listar";
		}
		
		return "MantenedorRegion/mostrarRegion";
	}

}
