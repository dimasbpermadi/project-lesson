package co.id.payment.corporate.corporateh2h.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/corporate-h2h")
public class ClientController {

	@GetMapping("/list")
	public ModelMap listClient() {
		return new ModelMap();
	}
	
	@GetMapping("/form")
	public ModelMap insertClient() {
		return new ModelMap();
	}
	
	@PostMapping("/form")
	public String editClient() {
		return "redirect:list";
	}
	
}
