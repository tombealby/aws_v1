package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Site map to make site searchable in Google
 *
 */
@RestController
public class SiteMapController {

	@GetMapping(value = "/sitemap.xml")
	public void serveSiteMapFile(HttpServletResponse response) throws IOException {

		response.setContentType("application/xml");
		final File sitemap = ResourceUtils.getFile("classpath:static/xml/sitemap.xml");
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sitemap))) {
			String line;
			StringBuilder siteMapBuilder = new StringBuilder();
			while ((line = bufferedReader.readLine()) != null) {
				siteMapBuilder.append(line);
			}
			ServletOutputStream outStream = response.getOutputStream();
			outStream.println(siteMapBuilder.toString());
			outStream.flush();
			outStream.close();
		}
	}

}
