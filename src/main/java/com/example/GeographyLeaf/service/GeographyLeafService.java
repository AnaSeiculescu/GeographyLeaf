package com.example.GeographyLeaf.service;

import com.example.GeographyLeaf.model.Country;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class GeographyLeafService {

	private static final String ALL_COUNTRIES_API_URL = "https://restcountries.com/v3.1/all?fields=name";

	public List<Country> getAllCountryNames() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Country[]> response = restTemplate.getForEntity(ALL_COUNTRIES_API_URL, Country[].class);
		return Arrays.asList(response.getBody());
	}

//	public List<Country> getAllCountryNames(String country) {
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Country[]> response = restTemplate.getForEntity(ALL_COUNTRIES_API_URL + country, Country[].class);
//		return Arrays.asList(response.getBody());
//	}
}
