package com.eshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.eshopping.dao.CategoryDAO;
import com.eshopping.model.Category;

@Controller   //This annotation indicates that this particular class serves the role of a controller. 
public class CategoryController 
{
	@Autowired  //This annotation enables you to inject the object dependency implicitly and we can set it to false if dependency is not required
	CategoryDAO categoryDAO;
	
	@RequestMapping(value="/category") //This annotation is used to map web requests onto the specific handler classes and handler methods
	public String showcategory1(Model m)
	{
		List<Category>categoryList=categoryDAO.listCategories();
		m.addAttribute("categoryList",categoryList);
		
		System.out.println("---Original Existing List---");
		return "Category";
	}
	
	//@RequestParam-automatically binds the request parameters to the arguments of your handler method
		@RequestMapping(value="/InsertCategory",method=RequestMethod.POST)
		public String insertCategory(@RequestParam("CategoryName")String categoryName,@RequestParam("CategoryDesc")String categoryDesc,Model m)
		{
			
			Category category=new Category();
			category.setCategoryName(categoryName);
			category.setCategoryDesc(categoryDesc);
			
			categoryDAO.addCategory(category);
			
			List<Category>categoryList=categoryDAO.listCategories();
			m.addAttribute("categoryList",categoryList);
			
			System.out.println("---Insert the category and list it---");
			return "Category";
		}
		
		
		//@PathVariable-annotation is used to bind the URI template variables to the handler method parameters of the controller
		@RequestMapping(value="/EditCategory/{categoryId}")
		public String editCategory(@PathVariable("categoryId")int categoryId,Model m) 
		{
			Category category=categoryDAO.getCategory(categoryId);
			
			m.addAttribute("category",category);
			
			System.out.println("---Edit the category---");
			
			return "UpdateCategory";
		}
	    
		
		@RequestMapping(value="/DeleteCategory/{categoryId}")
		public String deleteCategory(@PathVariable("categoryId")int categoryId,Model m) 
		
		{
			Category category= categoryDAO.getCategory(categoryId);
			
			categoryDAO.deleteCategory(category);

			List<Category>categoryList=categoryDAO.listCategories();
			m.addAttribute("categoryList",categoryList);
			
			System.out.println("---Deleted the selected category ---");
			
			return "Category";
		}
		
		@RequestMapping(value="/UpdateCategory",method=RequestMethod.POST)
		public String updateCategory(@RequestParam("categoryId")int categoryId,@RequestParam("categoryName")String categoryName,@RequestParam("categoryDesc")String categoryDesc,Model m)
		{
			Category category=categoryDAO.getCategory(categoryId);
			category.setCategoryName(categoryName);
			category.setCategoryDesc(categoryDesc);
			
			categoryDAO.updateCategory(category);
			
			List<Category>categoryList=categoryDAO.listCategories();
			m.addAttribute("categoryList",categoryList);
			
			System.out.println("---Updated category List---");
			return "Category";
		}

}