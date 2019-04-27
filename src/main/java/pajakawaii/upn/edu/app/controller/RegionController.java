
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	
	
	@RequestMapping (value="/buscarRegion", method=RequestMethod.POST)
	public String buscarRegion(Model model,			
			@RequestParam("id") int id) {
		
		try {
			
			Region region = regiondao.busquedaRegion(id);
			
			model.addAttribute("Vregion",region);			
		}
		catch (Exception ex) {
			System.out.print(ex.toString());
			
			return "redirect:/MantenedorRegion/listar";
		}
		
		return "MantenedorRegion/mostrarRegion";
	}
	
	
	//Create
		@GetMapping(value="/crear")
		public String crear() 
		{
			return "MantenedorRegion/crearRegion";
		}
		@PostMapping(value="/guardar")
		public String guardarRegion(Region region,
				@RequestParam("regionID") int regionID,
				@RequestParam("nombre_region") String nombre_region,
				@RequestParam("coordenadas") String coordenadas)
		{
			try {
				Region reg = new Region();
				reg.setRegionID(regionID);
				reg.setNombre_region(nombre_region);
				reg.setCoordenadas(coordenadas);
				regiondao.insertarRegion(reg);
			}
			catch (Exception ex) {
				System.out.print(ex.toString());;
			}
			return "redirect:/MantenedorRegion/listar";
		}	
		
		
		//Edit
		@RequestMapping(value="/editar/{regionID}", method = RequestMethod.GET)
		public ModelAndView editar(@PathVariable("regionID") int regionID) {
			List<Region> lista = new ArrayList<Region>();
			Region reg = regiondao.busquedaRegion(regionID);
			lista.add(reg);
			ModelAndView model = new ModelAndView("MantenedorRegion/Edit");
			model.addObject("region",lista);
			return model;
		}
		
		@RequestMapping(value="/guardarCambios", method = RequestMethod.POST)
		public String actualizarRegion(
				@RequestParam("regionID") int regionID,
				@RequestParam("nombre_region") String nombre_region,
				@RequestParam("coordenadas") String coordenadas)
		{
			System.out.println(regionID);
			try {
				Region reg = new Region();
				reg.setRegionID(regionID);
				reg.setNombre_region(nombre_region);
				reg.setCoordenadas(coordenadas);
				regiondao.editarRegion(reg);
			}
			catch (Exception ex) {
				System.out.print(ex.toString());;
			}
			return "redirect:/MantenedorRegion/listar";
		}
		
		//Eliminar
		@GetMapping(value="/eliminar")
		public String eliminarRegion(Model model, @RequestParam("regionID") int regionID)
		{
			try {
				regiondao.eliminarRegion(regionID);
			}
			catch (Exception ex) {
				System.out.print(ex.toString());;
			}
			return "redirect:/MantenedorRegion/listar";
		}
	}


