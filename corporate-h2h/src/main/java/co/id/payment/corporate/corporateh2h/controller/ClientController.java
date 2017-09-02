package co.id.payment.corporate.corporateh2h.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.id.payment.corporate.corporateh2h.dao.Clientdao;

@Controller
@RequestMapping("/corporate-h2h")
public class ClientController {
	
	@Autowired Clientdao clientdao;

	@GetMapping("/list")
	public ModelMap listClient(Pageable page) {
		return new ModelMap().addAttribute("listClient", clientdao.findAll(page));
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
