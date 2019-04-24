package pajakawaii.upn.edu.app.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import pajakawaii.upn.edu.app.dao.AvesDao;
import pajakawaii.upn.edu.app.model.Ave;


@Controller
@RequestMapping("/MantenedorAves")
public class AveController {
	
	
	private AvesDao avesDao;
	//Listar
	@GetMapping(value="/listar")
	public String listar(Model model) {
		
		List<Ave> aves = avesDao.listarAves();
		
		model.addAttribute("Modelaves",aves);
		System.out.println("Entra al AVESCONTROLLER");
		
		return "MantenedorAves/listarAves";
		
		
		
	}
	
	@RequestMapping(value="/aves", method=RequestMethod.GET)
	public String irAve() {
		
		
		return "ave";
	}
	
	@RequestMapping(value="buscarAve", method=RequestMethod.GET)
	public String buscarAve() {
		
		
		return "MantenedorAves/buscarAve";
	}
	

	
	
	@RequestMapping (value="/buscarAve", method=RequestMethod.POST)
	public String buscarAve(Model model,			
			@RequestParam("id") int id) {
		
		try {
			System.out.println("Entra a la busqueda de avessx");
			System.out.println(id);
			Ave ave = avesDao.busquedaAve(id);
			System.out.println(ave.getNombre_cientifico());
			model.addAttribute("Vave",ave);			
		}
		catch (Exception ex) {
			System.out.print(ex.toString());;
		}
		
		return "MantenedorAves/mostrarAve";
	}
	
	
	@RequestMapping(value="/buscarAve/{idAve}", method = RequestMethod.GET)
	public ModelAndView editar(@PathVariable("idAve") int id) {
		Ave ave = avesDao.busquedaAve(id);		
		ModelAndView model = new ModelAndView("MantenedorAves/mostrarAve");
		model.addObject("Modelave",ave);
		return model;
	}
	
	

}
