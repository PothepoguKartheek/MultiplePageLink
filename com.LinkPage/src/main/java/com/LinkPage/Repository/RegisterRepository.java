package com.LinkPage.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.LinkPage.dto.RegisterDto;
import com.LinkPage.entity.Continent;
import com.LinkPage.entity.Country;
import com.LinkPage.entity.State;

@Repository
public class RegisterRepository {
	
	
	@Autowired
	private SessionFactory factory;

	public void SaveCountryDetails(Country country) {

		Session session=factory.openSession();
		session.save(country);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		
	}
	

	public void SaveContinentDetails(Continent continent) {
		// TODO Auto-generated method stub
	
		Session session=factory.openSession();
		session.save(continent);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		
	}

	public void SaveStateDetails(State state) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		session.save(state);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		
	}
	
	public void saveUserDetails(RegisterDto dto)
	{
		
		
	}

//DINAMIC PAGES JSP	TOMCAT SERVER WILL LOAD THE JSP FILES 

	
	
}
