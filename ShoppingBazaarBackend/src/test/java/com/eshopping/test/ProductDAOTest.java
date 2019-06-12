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
		product.setProductName("Test products");
		product.setProductDesc("Tested products okay");
		 
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
    public void addProductTest3()
    {
    	Product product=new Product();
    	product.setProductName("Vanheusen");
    	product.setProductDesc("Brand available in bright color shirts and t-shirts cotton material texture");
    	assertTrue("problem in adding product",productDAO.addProduct(product));
    }
    
	@Ignore
	@Test
	public void deleteProductTest() 
	{
		Product product=productDAO.getProduct(27);
		assertTrue("problem in deleting product",productDAO.deleteProduct(product));
	}
	
	@Ignore
	@Test
	public void updateProductTest()
	{
		Product product=productDAO.getProduct(28);
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
			System.out.print(product.getProductId()+"\t");
			System.out.print(product.getProductName()+"\t");
			System.out.println(product.getProductDesc()+"\t");
		 }
		}
	}
	

