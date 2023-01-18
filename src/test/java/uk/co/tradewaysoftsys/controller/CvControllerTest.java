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
public class CvControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void call_cvUrl_returnsCvViewAnd200Response() throws Exception {
		mockMvc.perform(get("/tombealby/cv")).andExpect(status().isOk()).andExpect(view().name("fragments/tombealby/cv/cv"));
	}

	@Test
	public void call_badUrl_returnsNotFound() throws Exception {
		mockMvc.perform(get("/tombealby/cvtttt")).andExpect(status().isNotFound());
	}
	
	@Test
	public void call_cvUrl_returnsResponseBodyWithTitle() throws Exception {
		mockMvc.perform(get("/tombealby/cv"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("<title>Tom Bealby CV</title>")));
	}
	
	@Test
	public void call_cvUrl_returnsResponseBodyWithTabs() throws Exception {
		mockMvc.perform(get("/tombealby/cv"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString(makeExpectedTabs())));
	}
	
	@Test
	public void call_cvUrl_returnsResponseBodyWithMainHeading() throws Exception {
		mockMvc.perform(get("/tombealby/cv"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString(makeExpectedMainHeading())));
	}

	private String makeExpectedTabs() {
		return "<div class=\"tab\">\n" + 
				"  <button id=\"defaultOpen\" class=\"tablinks\" onclick=\"openTab(event, 'summary')\">Summary</button>\n" + 
				"  <button class=\"tablinks\" onclick=\"openTab(event, 'motivation')\">Work Values and Motivation</button>\n" + 
				"  <button class=\"tablinks\" onclick=\"openTab(event, 'employments')\">Employment History</button>\n" + 
				"  <button class=\"tablinks\" onclick=\"openTab(event, 'qualifications')\">Qualifications and Certifications</button>\n" + 
				"  <button class=\"tablinks\" onclick=\"openTab(event, 'bookreviews')\">Book Reviews</button>\n" + 
				"  <button class=\"tablinks\" onclick=\"openTab(event, 'blogs')\">Blogs</button>\n" + 
				"</div>";
	}

	private String makeExpectedMainHeading() {
		return "<h1>Tom Bealby</h1>\n" + 
				"\n" + 
				"<h2>email: tom.bealby67@gmail.com</h2>";
	}
}
