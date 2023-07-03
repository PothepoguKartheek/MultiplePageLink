package com.LinkPage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.LinkPage.Repository.RegisterRepository;
import com.LinkPage.Service.RegisterService;
import com.LinkPage.dto.ContinentDto;
import com.LinkPage.dto.CountryDto;
import com.LinkPage.dto.RegisterDto;
import com.LinkPage.dto.StateDto;

@Controller
public class LinkController {
	
	@Autowired
	private RegisterService service;
	
	@RequestMapping(value = "/Country")
	public ModelAndView CountryDetails()
	{
		return new ModelAndView("CountryLink.jsp");
	}
	
	@RequestMapping(value="/Continent")
	public ModelAndView ContinentDetails()
	{
		return new ModelAndView("ContinentLink.jsp");
	}
	@RequestMapping(value="/State")
	public ModelAndView StateDetails()
	{
		return new ModelAndView("StateLink.jsp");
	}
	
	@RequestMapping(value = "/CountryLogin")
	public ModelAndView SaveCountryDetails(CountryDto dto)
	{
		service.SaveCountry(dto);
		return new ModelAndView("Success.jsp");
	}
	
	@RequestMapping(value = "/ContinentLogin")
	public ModelAndView SaveContinentDetails(ContinentDto dto)
	{
		service.SaveContinent(dto);
		return new ModelAndView("Success.jsp");
	}
	
	@RequestMapping(value = "/StateLogin")
	public ModelAndView SaveStateDetails(StateDto dto)
	{
       service.saveState(dto);
       return new ModelAndView("Success.jsp");
	}
	
	@RequestMapping(value = "/saveUserDetails")
	public ModelAndView saveUserDetails(RegisterDto dto)
	{
		System.out.println(dto);
		return new ModelAndView("Success.jsp");
		
	}

	
}
