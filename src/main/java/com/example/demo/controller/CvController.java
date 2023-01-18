package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 *
 */
@Controller
public class CvController {
	
	@GetMapping("/tombealby/cv")
	public String showCv(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		return "cv";
	}

}
