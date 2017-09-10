package co.id.payment.corporate.corporateh2h.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import co.id.payment.corporate.corporateh2h.dao.Clientdao;
import co.id.payment.corporate.corporateh2h.entity.Client;

@Controller
@RequestMapping("/corporate-h2h")
public class ClientController {
	
	@Autowired Clientdao clientdao;

	@GetMapping("/list")
	public ModelMap listClient(Pageable page) {
		return new ModelMap().addAttribute("listClient", clientdao.findAll(page));
	}
	
	@GetMapping("/form")
		public ModelMap insertClient(@RequestParam(required=false, value="id") Client c) {
			if(c == null) {
				c = new Client();
			}
			return new ModelMap("client", c);
	}
	
	@PostMapping("/form")
	public String editClient(@ModelAttribute @Valid Client c, BindingResult errors, SessionStatus status) {
		if(errors.hasErrors()) {
			return "corporate-h2h/form";
		}
		clientdao.save(c);
		status.setComplete();
		return "redirect:list";
	}
	
}
