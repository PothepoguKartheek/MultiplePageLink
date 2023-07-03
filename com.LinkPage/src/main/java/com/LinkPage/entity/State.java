package com.LinkPage.entity;

import java.awt.image.ImageConsumer;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="state_info")
public class State implements Serializable{

	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	
	@Column(name="Statename")
	private String Statename;
	
	@Column(name="StateCapital")
	private String StateCapital;
	
	@Column(name="population")
	private String population;
	
	@Column(name="Area")
	private String Area;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatename() {
		return Statename;
	}

	public void setStatename(String statename) {
		Statename = statename;
	}

	public String getStateCapital() {
		return StateCapital;
	}

	public void setStateCapital(String stateCapital) {
		StateCapital = stateCapital;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	
	
	

}
