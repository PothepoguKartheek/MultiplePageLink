package com.LinkPage.Config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class ServletInit implements WebApplicationInitializer{
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext config= new AnnotationConfigWebApplicationContext();
		
		config.register(AppConfig.class);
		// TODO Auto-generated method stub
		DispatcherServlet Servlet = new DispatcherServlet(config);
		
		Dynamic context=servletContext.addServlet("dispactherServlet", Servlet);
		context.addMapping("/");
		context.setLoadOnStartup(1);
		
		
		
		
		
	}

}
