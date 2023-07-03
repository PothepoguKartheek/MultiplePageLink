package com.LinkPage.dto;

import java.io.Serializable;

public class CountryDto implements Serializable{
	
	private String CountryName;
	private String CapitalName;
	private String TotalArea;
	private String Population;
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getCapitalName() {
		return CapitalName;
	}
	public void setCapitalName(String capitalName) {
		CapitalName = capitalName;
	}
	public String getTotalArea() {
		return TotalArea;
	}
	public void setTotalArea(String totalArea) {
		TotalArea = totalArea;
	}
	public String getPopulation() {
		return Population;
	}
	public void setPopulation(String population) {
		Population = population;
	}
	

	
}
