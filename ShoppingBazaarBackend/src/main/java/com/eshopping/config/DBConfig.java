package com.eshopping.config;

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

import com.eshopping.dao.CategoryDAOImpl;
import com.eshopping.model.Cart;
import com.eshopping.model.Category;
import com.eshopping.model.Product;
import com.eshopping.model.Supplier;
import com.eshopping.model.UserDetail;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.eshopping")
public class DBConfig {
	
@Bean(name="dataSource")
public DataSource getH2DataSource()
{
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	
	
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	dataSource.setUsername("sa");
	dataSource.setPassword("");
	
	System.out.println("---DataSource object is Created");
	return dataSource;
}

@Bean(name="sessionFactory")
public SessionFactory getSessionFactory()
{
	Properties properties=new Properties();
	properties.put("hibernate.hbm2ddl.auto", "update");
	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	DataSource dataSource=this.getH2DataSource();
	
	LocalSessionFactoryBuilder factory=new LocalSessionFactoryBuilder(dataSource);
	factory.addProperties(properties);
	factory.addAnnotatedClass(Category.class);
	factory.addAnnotatedClass(Supplier.class);
	factory.addAnnotatedClass(Product.class);
	factory.addAnnotatedClass(UserDetail.class);
	factory.addAnnotatedClass(Cart.class);

	System.out.println("---Session Factory Object is created---");
	SessionFactory sessionFactory=factory.buildSessionFactory();
	return sessionFactory;
}

@Bean(name="txManager")
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
{
	System.out.println("---Transaction Manager Object is Created ---");
	return new HibernateTransactionManager(sessionFactory);
}
//@Bean("CategoryDAO")
 //public CategoryDAOImpl getCategoryDAO()
//{
	//return new CategoryDAOImpl();
//}
}

