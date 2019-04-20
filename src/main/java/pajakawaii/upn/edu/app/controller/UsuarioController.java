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


@Controller
public class UsuarioController {
	@RequestMapping(value="/usuario", method=RequestMethod.GET)
	public String irUsuario() {
		
		
		return "usuario";
	}

}
