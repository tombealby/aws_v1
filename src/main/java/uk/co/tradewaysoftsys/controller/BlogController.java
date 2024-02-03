package uk.co.tradewaysoftsys.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.co.tradewaysoftsys.pageConfiguration.HomePageConfig;

@Controller
public class BlogController {

	@Value("${availabilityText}")
	private String availabilityText;

	@GetMapping("/tombealby/blogs")
	public String showBlogsHomeTomBealby(@RequestParam(value = "displayCvLink", required = false) Boolean displayCvLink,
			final Model model) {
		model.addAttribute("availabilityText", availabilityText);
		HomePageConfig.setDisplayCvLinkWithDefaultHideLink(displayCvLink, model);
		return "fragments/tombealby/blogs/blogsHome";
	}

	// TODO remove davidbealby/blogs code
//	@GetMapping("/davidbealby/blogs")
//	public String showBlogsHomeDavidBealby(Model model) {
//		model.addAttribute("isViewBlogsHome", true);
//		return "fragments/davidbealby/blogs/blogsHome";
//	}

	@GetMapping("/tombealby/blogs/problemSolver")
	public String showProblemSolver(Model model) {
		return "fragments/tombealby/blogs/problemSolver";
	}

	@GetMapping("/tombealby/blogs/familyTragedy")
	public String showFamilyTragedy(Model model) {
		return "fragments/tombealby/blogs/familyTragedy";
	}

	@GetMapping("/tombealby/blogs/codeReviews")
	public String showCodeReviews(Model model) {
		return "fragments/tombealby/blogs/codeReviews";
	}

}
