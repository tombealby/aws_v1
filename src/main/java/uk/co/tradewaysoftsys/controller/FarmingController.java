package uk.co.tradewaysoftsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FarmingController {
	
	@GetMapping("/tombealby/farm")
	public String showCv() {
		return "fragments/tombealby/farming/farming";
	}

}
