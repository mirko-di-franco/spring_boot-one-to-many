package com.generation.relazionionetomany.mvcController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SwaggerController {

	@GetMapping
	public String redirect() {
		return "redirect:/swagger-ui/index.html";
	}
}
