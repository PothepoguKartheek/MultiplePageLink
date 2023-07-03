package com.LinkPage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="continent_info")
public class Continent implements Serializable{
	
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator ="auto")
	private int id;
	
	@Column(name="Continentname")
	private String Continentname;
	
	@Column(name="area")
	private String area;
	
	@Column(name="population")
	private String population;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContinentname() {
		return Continentname;
	}

	public void setContinentname(String continentname) {
		Continentname = continentname;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	
	

}
