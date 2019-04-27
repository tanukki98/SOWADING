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

import pajakawaii.upn.edu.app.dao.UsuarioDao;
import pajakawaii.upn.edu.app.model.Usuario;


@Controller
@RequestMapping("/MantenedorUsuario")
public class UsuarioController {

	@Autowired
	private UsuarioDao usuariodao;
	
	@GetMapping(value="/Inicio")
	public String inicio() {
		return "redirect:/MantenedorUsuario/listar";
	}
	
	//Create
	@GetMapping(value="/crear")
	public String crear() 
	{
		return "MantenedorUsuario/Create";
	}
	@PostMapping(value="/guardar")
	public String guardarUsuario(Usuario usuario,
			@RequestParam("usuarioID") int usuarioID,
			@RequestParam("nombres") String nombres,
			@RequestParam("apellidos") String apellidos,
			@RequestParam("nacionalidad") String nacionalidad,
			@RequestParam("sexo") String sexo,
			@RequestParam("nombreu") String nombreu,
			@RequestParam("contrasenia") String contrasenia,
			@RequestParam("esAdmin") boolean esAdmin)
	{
		try {
			Usuario usu = new Usuario();
			usu.setUsuarioID(usuarioID);
			usu.setNombres(nombres);
			usu.setApellidos(apellidos);
			usu.setNacionalidad(nacionalidad);
			usu.setSexo(sexo);
			usu.setNombreu(nombreu);
			usu.setContrasenia(contrasenia);
			usu.setEsAdmin(esAdmin);
			usuariodao.insertarUsuario(usu);
		}
		catch (Exception ex) {
			System.out.print(ex.toString());;
		}
		return "redirect:/MantenedorUsuario/listar";
	}
	
	//List
	@GetMapping(value="/listar")
	public String listar(Model model) {
		List<Usuario> usuarios = usuariodao.listarUsuario();
		model.addAttribute("Modelusuarios",usuarios);
		return "MantenedorUsuario/listarUsuarios";
	}
	
	//Edit
	@RequestMapping(value="/editar/{idUsuario}", method = RequestMethod.GET)
	public ModelAndView editar(@PathVariable("usuarioID") int usuarioID) {
		List<Usuario> lista = new ArrayList<Usuario>();
		Usuario usu = usuariodao.busquedaUsuario(usuarioID);
		lista.add(usu);
		ModelAndView model = new ModelAndView("MantenedorUsuario/Edit");
		model.addObject("usuario",lista);
		return model;
	}
	
	@RequestMapping(value="/guardarCambios", method = RequestMethod.POST)
	public String actualizarUsuario(
			@RequestParam("usuarioID") int usuarioID,
			@RequestParam("nombres") String nombres,
			@RequestParam("apellidos") String apellidos,
			@RequestParam("nacionalidad") String nacionalidad,
			@RequestParam("sexo") String sexo,
			@RequestParam("nombreu") String nombreu,
			@RequestParam("contrasenia") String contrasenia,
			@RequestParam("esAdmin") boolean esAdmin)
	{
		System.out.println(usuarioID);
		try {
			Usuario usu = new Usuario();
			usu.setUsuarioID(usuarioID);
			usu.setNombres(nombres);
			usu.setApellidos(apellidos);
			usu.setNacionalidad(nacionalidad);
			usu.setSexo(sexo);
			usu.setNombreu(nombreu);
			usu.setContrasenia(contrasenia);
			usu.setEsAdmin(esAdmin);
			usuariodao.editarUsuario(usu);
		}
		catch (Exception ex) {
			System.out.print(ex.toString());;
		}
		return "redirect:/MantenedorUsuario/listar";
	}
	
	//Eliminar
	@GetMapping(value="/eliminar")
	public String eliminarUsuario(Model model, @RequestParam("usuarioID") int usuarioID)
	{
		try {
			usuariodao.eliminarUsuario(usuarioID);
		}
		catch (Exception ex) {
			System.out.print(ex.toString());;
		}
		return "redirect:/MantenedorUsuario/listar";
	}
}



