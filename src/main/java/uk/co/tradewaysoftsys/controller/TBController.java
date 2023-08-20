package uk.co.tradewaysoftsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TBController {

	@GetMapping("/tombealby")
	public String showTomBealbyHome() {
		return "fragments/tombealby/home";
	}

}
