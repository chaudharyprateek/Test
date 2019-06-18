package com.ecomm.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ecomm.model.Category;
import com.ecomm.model.Product;
import com.ecomm.model.Supplier;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.ecomm")

public class DBConfig {
	
	//Create a bean for data source
	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/project_1");
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		System.out.println("==============DataSourceCreation============");
		return dataSource;
		
		
	}	
	
	
	//Create a bean for SessionFactory
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateproperties = new Properties();
		hibernateproperties.put("hibernate.hbm2ddl.auto","update");
		hibernateproperties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		LocalSessionFactoryBuilder factory = new LocalSessionFactoryBuilder(getH2DataSource());
		factory.addProperties(hibernateproperties);
		factory.addAnnotatedClass(Category.class);				//Every Model Class are added
		factory.addAnnotatedClass(Product.class);
		factory.addAnnotatedClass(Supplier.class);
		
		SessionFactory sessionFactory = factory.buildSessionFactory();
		System.out.println("==============Session Factory Implementation============");
		return sessionFactory;
		
	}
	
	//Create a bean for HibernateTransactionManager
	
	@Bean(name="txManager")
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{	System.out.println("==============Hibernate Transaction Manager============");
		return new HibernateTransactionManager(sessionFactory);
	}

	
	

}
