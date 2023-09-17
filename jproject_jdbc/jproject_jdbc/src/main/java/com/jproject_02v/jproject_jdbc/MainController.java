package com.jproject_02v.jproject_jdbc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping("/main")
	public String greetingForm(Model model) {
		model.addAttribute("main", new ModelSetters());
		return "main";
	}

	@PostMapping("/main")
	public String greetingSubmit(@ModelAttribute ModelSetters main, Model model) {
		model.addAttribute("main", main);
		return "added";
	}

}