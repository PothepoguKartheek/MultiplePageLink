package com.LinkPage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Country_info")
public class Country implements Serializable{
	
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	
	@Column(name="CountryName")
	private String CountryName;
	
	@Column(name="CapitalName")
	private String CapitalName;
	
	@Column(name="TotalArea")
	private String TotalArea;
	
	@Column(name="Population")
	private String Population;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
