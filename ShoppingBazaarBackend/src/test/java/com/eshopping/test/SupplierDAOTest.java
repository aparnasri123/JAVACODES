package com.eshopping.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eshopping.dao.SupplierDAO;
import com.eshopping.model.Supplier;

public class SupplierDAOTest {
  
	static SupplierDAO supplierDAO;
	
	@BeforeClass
	public static void executedFirst() 
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.eshopping");
		context.refresh();
		
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	}
    
	@Ignore
	@Test
	public void addSupplierTest() {
		
		Supplier supplier=new Supplier();
		supplier.setSupplierName("Aparna");
		supplier.setSupplierDesc("Distributer and Sales Head of all Branded Products");
		
		assertTrue("problem in adding supplier",supplierDAO.addSupplier(supplier));
		
	}
    
    @Ignore
	@Test
	public void addSupplierTest1() {
		
		Supplier supplier=new Supplier();
		supplier.setSupplierName("Praveen Kumar");
    	supplier.setSupplierDesc("Marketing Head of Branded Products");
		
		assertTrue("problem in adding supplier",supplierDAO.addSupplier(supplier));
		
	}
    
	@Ignore
	@Test
	public void addSupplierTest2() 
	{
       Supplier supplier=new Supplier();
       supplier.setSupplierName("Anupam");
       supplier.setSupplierDesc("Purchase Order team analyst");
       assertTrue("problem in adding supplier",supplierDAO.addSupplier(supplier));
    }
    
	@Ignore
	@Test
	public void deleteSupplierTest() 
	{
		Supplier supplier=supplierDAO.getSupplier(45);
		assertTrue("problem in adding supplier",supplierDAO.deleteSupplier(supplier));
	}
	
	@Ignore
     @Test
     public void updateSupplierTest()
     {
         
        Supplier supplier=supplierDAO.getSupplier(6);
        supplier.setSupplierName("Sampath");
        assertTrue("problem in adding supplier",supplierDAO.updateSupplier(supplier));
        
     }
     
     @Test
     public void listSupplierTest() 
     {
          List<Supplier> supplierList=supplierDAO.listSuppliers();
    	  assertTrue("problem in adding list",supplierList.size()>0);
    	  
    	   for(Supplier supplier:supplierList)
    	   {
    		   
    		  System.out.print(supplier.getSupplierId()+"\t");
     		  System.out.print(supplier.getSupplierName()+"\t");
     		  System.out.println(supplier.getSupplierDesc()+"\t");
    	   }
      }
    	 
    
     }



























