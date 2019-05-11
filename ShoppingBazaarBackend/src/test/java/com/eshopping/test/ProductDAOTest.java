package com.eshopping.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eshopping.dao.ProductDAO;
import com.eshopping.model.Product;

public class ProductDAOTest {

	static ProductDAO productDAO;    
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.eshopping");
		context.refresh();
		productDAO=(ProductDAO)context.getBean("productDAO");
	}
    
	@Ignore
	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductName("Peter England");
		product.setProductDesc("Brand product available in all colors");
		 
		assertTrue("problem in adding products", productDAO.addProduct(product));
	}
	
	@Ignore
	@Test
	public void addProductTest1()
	{
		Product product = new Product();
		product.setProductName("Oxemberg");
		product.setProductDesc("Brand available in all colors and textures");
		
		assertTrue("problem in adding products",productDAO.addProduct(product));
	
	}
    
	@Ignore
	@Test
	public void addProductTest2()
	{
		Product product = new Product();
		product.setProductName("Allen Solley");
		product.setProductDesc("Brand available in prime colors and cotton texture");
		
		assertTrue("problem in adding products",productDAO.addProduct(product));
	
	}
    
	@Ignore
	@Test
	public void deleteProductTest() 
	{
		Product product=productDAO.getProduct(9);
		assertTrue("problem in deleting product",productDAO.deleteProduct(product));
	}
	
	@Ignore
	@Test
	public void updateProductTest()
	{
		Product product=productDAO.getProduct(10);
		product.setProductName("Siyarams");
		assertTrue("problem in adding product",productDAO.updateProduct(product));
	}
	
	@Test
	public void productlistTest()
	{
		List<Product> productList = productDAO.listProducts();
		
		assertTrue("problem in adding products",productList.size()>0);
		for(Product product:productList)
		{	
			System.out.println(product.getProductId()+"\t");
			System.out.println(product.getProductName()+"\t");
			System.out.println(product.getProductDesc()+"\t");
		 }
		}
	}
	

