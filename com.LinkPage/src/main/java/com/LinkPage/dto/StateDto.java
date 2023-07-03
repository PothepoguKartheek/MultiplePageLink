package com.LinkPage.dto;

import java.io.Serializable;

public class StateDto implements Serializable{
	
	private String Statename;
	
	private String StateCapital;
	
	private String population;
	
	private String Area;

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
