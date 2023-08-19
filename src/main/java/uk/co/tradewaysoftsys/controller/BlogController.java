package uk.co.tradewaysoftsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

	@GetMapping("/tombealby/blogs")
	public String showBlogsHomeTomBealby(Model model) {
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
