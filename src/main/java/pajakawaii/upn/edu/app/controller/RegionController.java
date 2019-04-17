package pajakawaii.upn.edu.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RegionController {
	@RequestMapping(value="/region", method=RequestMethod.GET)
	public String irRegion() {
		
		
		return "region";
	}

}
