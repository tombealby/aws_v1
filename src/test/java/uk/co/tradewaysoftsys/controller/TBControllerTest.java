package uk.co.tradewaysoftsys.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@AutoConfigureMockMvc
@SpringBootTest
public class TBControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void call_blogsUrl_returnsBlogsViewAnd200Response() throws Exception {
		mockMvc.perform(get("/tombealby"))
		.andExpect(status().isOk())
		.andExpect(view().name("fragments/tombealby/home"));
	}

	@Test
	public void call_blogsUrl_returnsResponseBodyWithTitle() throws Exception {
		mockMvc.perform(get("/tombealby"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("<title>Tom Bealby Home</title>")));
	}

	@Test
	public void call_blogsUrl_returnsResponseBodyWithMainHeading() throws Exception {
		mockMvc.perform(get("/tombealby"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString(makeExpectedMainHeading())));
	}

//	@Test
//	public void call_blogsUrl_returnsResponseBodyWithBlogs() throws Exception {
//		final MvcResult result = mockMvc.perform(get("/tombealby/blogs")).andReturn();
//        final String content = result.getResponse().getContentAsString();
//        assertTrue(content.contains("To read a blog written in 2018 while working at Centiq: My Job as a Problem Solver"));
//        assertTrue(content.contains("To read blog: Tom Sharpe, A Family Tragedy"));
//	}

	private String makeExpectedMainHeading() {
		return "<h1>Tom Bealby</h1>\n" +
				"\n" +
				"<h2 class=\"email\">email: tom.bealby@outlook.com</h2>";
	}

}
