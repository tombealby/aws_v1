package uk.co.tradewaysoftsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 *
 */
@Controller
public class CvController {
	
	@GetMapping("/tombealby/cv")
	public String showCv() {
		return "fragments/tombealby/cv/cv";
	}

}
