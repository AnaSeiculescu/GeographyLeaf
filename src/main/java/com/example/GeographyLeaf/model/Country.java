package com.example.GeographyLeaf.model;

import lombok.Data;

@Data
public class Country {
	private CountryName name;

	public String getSimplifiedName() {
		return name.getCommon();
	}
}
