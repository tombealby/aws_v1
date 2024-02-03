package uk.co.tradewaysoftsys.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.co.tradewaysoftsys.pageConfiguration.HomePageConfig;

@Controller
public class TravelController {

	@Value("${availabilityText}")
	private String availabilityText;

	@GetMapping("/tombealby/travel")
	public String showTravel(@RequestParam(value = "displayCvLink", required = false) Boolean displayCvLink,
			final Model model) {
		model.addAttribute("availabilityText", availabilityText);
		HomePageConfig.setDisplayCvLinkWithDefaultHideLink(displayCvLink, model);
		return "fragments/tombealby/travel/travel";
	}

	@GetMapping("/tombealby/travel/india_2023")
	public String showIndia_2023(@RequestParam(value = "displayCvLink", required = false) Boolean displayCvLink,
			final Model model) {
		model.addAttribute("availabilityText", availabilityText);
		HomePageConfig.setDisplayCvLinkWithDefaultHideLink(displayCvLink, model);
		return "fragments/tombealby/travel/india_2023";
	}

}
