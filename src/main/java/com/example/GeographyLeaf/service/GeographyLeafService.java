package com.example.GeographyLeaf.service;

import com.example.GeographyLeaf.model.Country;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class GeographyLeafService {

	private static final String ALL_COUNTRIES_API_URL = "https://restcountries.com/v3.1";

	RestTemplate restTemplate = new RestTemplate();

	public List<Country> getAllCountryNames() {
		ResponseEntity<Country[]> response = restTemplate.getForEntity(ALL_COUNTRIES_API_URL + "/all", Country[].class);
		return Arrays.asList(response.getBody());
	}

	public Country getCountryByName(String name) {
		try {
			ResponseEntity<Country[]> response = restTemplate.getForEntity(ALL_COUNTRIES_API_URL + "/name/" + name, Country[].class);
			return response.getBody() != null ? response.getBody()[0] : null;
		} catch (RestClientException e) {
			throw new RuntimeException("Something went wrong fetching the country by name: " +  e);
		}
	}

//	public List<Country> getOfficialCountryName() {
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Country[]> response = restTemplate.getForEntity(ALL_COUNTRIES_API_URL + "?fields=capital", Country[].class);
//		return Arrays.asList(response.getBody());
//	}

}
