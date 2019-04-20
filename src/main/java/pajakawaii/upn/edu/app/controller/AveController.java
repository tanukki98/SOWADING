package pajakawaii.upn.edu.app.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pajakawaii.upn.edu.app.model.Ave;


@Controller
public class AveController {
	@RequestMapping(value="/aves", method=RequestMethod.GET)
	public String irAve() {
		
		
		return "ave";
	}

	
	
	/*private List<Ave> getLista(){
		List<Ave> list = null;
	list = new LinkedList<>();
	try {
	    list = new LinkedList<>();
		;}catch(Exception e){}
			
	}*/
}
