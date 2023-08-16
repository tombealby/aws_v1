package uk.co.tradewaysoftsys.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
public class BookReviewsControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void call_bookReviewsUrl_returnsCvViewAnd200Response() throws Exception {
		mockMvc.perform(get("/tombealby/bookReviews")).andExpect(status().isOk())
				.andExpect(view().name("fragments/tombealby/bookReviews/bookReviewsHome"));
	}

	@Test
	public void call_badUrl_returnsNotFound() throws Exception {
		mockMvc.perform(get("/tombealby/bookReviewstttt")).andExpect(status().isNotFound());
	}

	@Test
	public void call_bookReviewsUrl_returnsResponseBodyWithTitle() throws Exception {
		mockMvc.perform(get("/tombealby/bookReviews"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("<title>Tom Bealby Book Reviews</title>")));
	}

	@Test
	public void call_bookReviewsUrl_returnsResponseBodyWithMainHeading() throws Exception {
		mockMvc.perform(get("/tombealby/bookReviews"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString(makeExpectedMainHeading())));
	}

	private String makeExpectedMainHeading() {
		return "<h1>Tom Bealby</h1>\n" + 
				"\n" + 
				"<h2 class=\"email\">tom.bealby67@gmail.com</h2>";
	}
}
