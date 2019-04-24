package pajakawaii.upn.edu.app.controller;





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
import java.util.ArrayList;
import java.util.List;



import pajakawaii.upn.edu.app.dao.AvesDao;
import pajakawaii.upn.edu.app.model.Ave;


@Controller
@RequestMapping("/MantenedorAves")
public class AveController {
	
	@Autowired//INSTANCIA AUTOMATICAMENTE SIGUIENDO EL BEAN 
	private AvesDao avesdao;
	//Listar
	@GetMapping(value="/listar")
	public String listar(Model model) {
		
		List<Ave> aves = new ArrayList<Ave>();
				aves=avesdao.listarAves();
		
		model.addAttribute("Modelaves",aves);
		
		
		return "MantenedorAves/listarAves";
		
		
		
	}
	
	@RequestMapping(value="/aves", method=RequestMethod.GET)
	public String irAve() {
		
		
		return "ave";
	}
	
	/*@RequestMapping(value="buscarAve", method=RequestMethod.GET)
	public String buscarAve() {
		
		
		return "MantenedorAves/buscarAve";
	}*/
	

	
	
	@RequestMapping (value="/buscarAve", method=RequestMethod.POST)
	public String buscarAve(Model model,			
			@RequestParam("id") int id) {
		
		
		try {
			System.out.println("Entra a la busqueda de avessx");
			System.out.println(id);
			Ave ave = avesdao.busquedaAve(id);
			System.out.println(ave.getNombre_cientifico());
			model.addAttribute("Vave",ave);			
		}
		catch (Exception ex) {
			System.out.print(ex.toString());
			return "redirect:/MantenedorAves/listar";
		}
		
		return "MantenedorAves/mostrarAve";
	}
	
	/*
	@RequestMapping(value="/buscarAve/{idAve}", method = RequestMethod.GET)
	public ModelAndView editar(@PathVariable("idAve") int id) {
		Ave ave = avesdao.busquedaAve(id);		
		ModelAndView model = new ModelAndView("MantenedorAves/mostrarAve");
		model.addObject("Modelave",ave);
		return model;
	}
	*/
	

}
