package com.LinkPage.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("com.LinkPage")
public class AppConfig {
	
	@Bean
	public ModelMapper getModelMapper()
	{
		return new ModelMapper();
	}
	
	@Bean
	public LocalSessionFactoryBean getSession()
	{
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setDataSource(getdataSourse());
		bean.setPackagesToScan("com.LinkPage.entity");
		bean.setHibernateProperties(getProperties());
		return bean;
		
	}

	public static Properties getProperties() {
		// TODO Auto-generated method stub
	
		Properties properties=new Properties();
		properties.setProperty("hibernate.show_sql","true");
		properties.setProperty("hibernate.hbm2ddl.auto","update");
		return properties;
		
	}

	@Bean
	public  DataSource getdataSourse() {
		// TODO Auto-generated method stub
		DriverManagerDataSource source=new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/ailen");
		source.setUsername("root");
		source.setPassword("root");
		return source;
	}
	

}
/*
 * @bean it annotation the method return object which will be handle by container
 * 
 * model mapper we can map one object to another object properties 
 * 
 * depencendy injection @
 * autowired
 */
