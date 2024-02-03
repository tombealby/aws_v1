package uk.co.tradewaysoftsys.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.co.tradewaysoftsys.pageConfiguration.HomePageConfig;

@Controller
public class HomePageController {

	@Value("${availabilityText}")
	private String availabilityText;

	@GetMapping("/tombealby")
	public String showTomBealbyHome(@RequestParam(value = "displayCvLink", required = false) Boolean displayCvLink,
			final Model model) {
		model.addAttribute("availabilityText", availabilityText);
		HomePageConfig.setDisplayCvLinkWithDefaultShowLink(displayCvLink, model);
		return "fragments/tombealby/home";
	}

}
