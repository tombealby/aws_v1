package uk.co.tradewaysoftsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.co.tradewaysoftsys.pageConfiguration.HomePageConfig;

@Controller
public class HomePageController {

	@GetMapping("/tombealby")
	public String showTomBealbyHome(@RequestParam(value = "displayCvLink", required = false) Boolean displayCvLink,
			final Model model) {
		HomePageConfig.setDisplayCvLinkWithDefaultShowLink(displayCvLink, model);
		return "fragments/tombealby/home";
	}

}
