package com.example.GeographyLeaf.model;

import lombok.Data;

import java.util.List;

@Data
public class Country {
	private CountryName name;
	private List<String> capital;
	private int area;

	public String getSimplifiedName() {
		return name.getCommon();
	}
}
