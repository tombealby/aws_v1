package uk.co.tradewaysoftsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 *
 */
@Controller
public class BookReviewsController {

	@GetMapping("/tombealby/bookReviews")
	public String showBookReviews() {
		return "fragments/tombealby/bookReviews/bookReviewsHome";
	}

}
