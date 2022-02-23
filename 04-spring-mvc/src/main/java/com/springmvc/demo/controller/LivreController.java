package com.springmvc.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.demo.entity.Livre;

@Controller
public class LivreController {
	
	@SuppressWarnings("serial")
	private Map<String, String> listEditeur = new LinkedHashMap<String, String>(){{
		put("Hachette", "Hachette");
		put("Editis", "Editis");
		put("Gallimard", "Gallimard");
		put("Albin Michel", "Albin Michel");
		put("Actes Sud", "Actes Sud");
	}};
	
	@SuppressWarnings("serial")
	private Map<String, String> edition = new LinkedHashMap<String, String>(){{
		put("Poche", "Poche");
		put("Normal", "Normal");
	}};
	
	@GetMapping("afficheLivreForm")
	public String afficheLivreForm(Model model) {
		model.addAttribute("livre", new Livre());
		model.addAttribute("monEditeur", listEditeur);
		model.addAttribute("monEdition", edition);
		return "livre-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("livre") Livre newLivre ) {
		return "validation-form";
	}

}
