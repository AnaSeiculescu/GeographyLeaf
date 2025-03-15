package com.example.GeographyLeaf.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
@RequiredArgsConstructor
public class GeographyLeafController {

	@GetMapping
	public String getHomePage(Model model) {
		return "/home";
	}

	@GetMapping("/geoleaf")
	public String getGeoLeafPage(Model model) {
		return "/geographyLeaf";
	}

}
