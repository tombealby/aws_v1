package uk.co.tradewaysoftsys.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@AutoConfigureMockMvc
@SpringBootTest
public class SiteMapControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void call_sitemapUrl_returns200Response() throws Exception {
		mockMvc.perform(get("/sitemap.xml")).andExpect(status().isOk());
	}

	@Test
	public void call_sitemapUrl_returnsResponseBodyContainingLocations() throws Exception {
		final MvcResult result = mockMvc.perform(get("/sitemap.xml")).andReturn();
        final String content = result.getResponse().getContentAsString();
        assertTrue(content.contains("<loc>http://www.tradewaysoftsys.co.uk/tombealby/cv</loc>"));
        assertTrue(content.contains("<loc>http://www.tradewaysoftsys.co.uk/tombealby/blogs</loc>"));
	}

}
