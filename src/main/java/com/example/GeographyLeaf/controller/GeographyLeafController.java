package com.example.GeographyLeaf.controller;

import com.example.GeographyLeaf.model.Country;
import com.example.GeographyLeaf.service.GeographyLeafService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/home")
@RequiredArgsConstructor
public class GeographyLeafController {

	private final GeographyLeafService geographyLeafService;

	@GetMapping
	public String getHomePage(Model model) {
		List<Country> countryList = geographyLeafService.getAllCountryNames();
		model.addAttribute("country", new Country());
		model.addAttribute("countryList", countryList);
		return "/home";
	}

	@GetMapping("/geoleaf")
	public String getCountryInfoGeoLeafPage(@RequestParam(required = false) String name, Model model) {
		model.addAttribute("countryName", name);
		return "/geographyLeaf";
	}

}
