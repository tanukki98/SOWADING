package pajakawaii.upn.edu.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UsuarioController {
	@RequestMapping(value="/usuario", method=RequestMethod.GET)
	public String irUsuario() {
		
		
		return "usuario";
	}

}