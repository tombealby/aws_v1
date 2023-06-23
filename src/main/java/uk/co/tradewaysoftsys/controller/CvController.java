package uk.co.tradewaysoftsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 *
 */
@Controller
public class CvController {
	
	@GetMapping("/tombealby/cv")
	public String showCv(Model model) {
		return "fragments/tombealby/cv/cv";
	}

}
