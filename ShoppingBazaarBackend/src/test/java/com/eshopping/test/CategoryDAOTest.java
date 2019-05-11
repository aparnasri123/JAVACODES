package com.eshopping.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eshopping.dao.CategoryDAO;
import com.eshopping.model.Category;

public class CategoryDAOTest 
{

	static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.eshopping");
		context.refresh();
		
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	@Ignore
	@Test
	public void addCategoryTest()
	{
		Category category=new Category();
		category.setCategoryName("Test");
		category.setCategoryDesc("testing");
		
		assertTrue("problem in adding category",categoryDAO.addCategory(category));
		
	}
    @Ignore
	@Test
	public void addCategoryTest1()
	{
		Category category=new Category();
		category.setCategoryName("Shirt");
		category.setCategoryDesc("White Formal Shirt with neck collar neck of all Brands");
		
		assertTrue("problem in adding category",categoryDAO.addCategory(category));
		
	}
    
    @Test
    public void deleteCategoryTest() {
    	Category category=categoryDAO.getCategory(17);
    	assertTrue("problem in deleting category",categoryDAO.deleteCategory(category));
    	
    }
    @Ignore
    @Test
    public void updateCategoryTest() {
    	Category category=categoryDAO.getCategory(17);
    	category.setCategoryDesc("Testing category");
    	assertTrue("problem in updating category",categoryDAO.updateCategory(category));
    }
    
     @Test
     public void listCategoryTest()
     {
    	 List<Category> categoryList=categoryDAO.listCategories();
    	 
    	 assertTrue("problem in listing category",categoryList.size()>0);
    	  for(Category category:categoryList)
    	  {
    		  System.out.print(category.getCategoryId()+":");
    		  System.out.print(category.getCategoryName()+"");
    		  System.out.println(category.getCategoryDesc()+"");
    	  }
     }
    
	
}
