package com.LinkPage.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LinkPage.Repository.RegisterRepository;
import com.LinkPage.dto.ContinentDto;
import com.LinkPage.dto.CountryDto;
import com.LinkPage.dto.StateDto;
import com.LinkPage.entity.Continent;
import com.LinkPage.entity.Country;
import com.LinkPage.entity.State;

@Service
public class RegisterService {
	
	
	@Autowired
	private RegisterRepository registerRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	
	public void SaveCountry(CountryDto dto)
	{
		Country country=mapper.map(dto, Country.class);
		registerRepository.SaveCountryDetails(country);
	}
	
	public void SaveContinent(ContinentDto dto)
	{
		Continent continent=mapper.map(dto, Continent.class);
		registerRepository.SaveContinentDetails(continent);
	}
	
    public void saveState(StateDto dto)
    {
       State state=mapper.map(dto, State.class);
       registerRepository.SaveStateDetails(state);
    }

}
