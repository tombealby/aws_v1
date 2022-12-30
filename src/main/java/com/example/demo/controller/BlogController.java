package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

	@GetMapping("/tombealby/blogs")
	public String showBlogsHome(Model model) {
		return "blogsHome";
	}

	@GetMapping("/tombealby/blogs/problemSolver")
	public String showProblemSolver(Model model) {
		return "problemSolver";
	}

	@GetMapping("/tombealby/blogs/familyTragedy")
	public String showFamilyTragedy(Model model) {
		return "familyTragedy";
	}

}
