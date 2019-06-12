package com.eshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.eshopping.dao.SupplierDAO;
import com.eshopping.model.Category;
import com.eshopping.model.Product;
import com.eshopping.model.Supplier;

@Controller
public class SupplierController {
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping(value="/supplier")
	public String showSupplier(Model m) {
		
		List<Supplier>supplierList=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",supplierList);
		
		return "Supplier";	
	}
	
	@RequestMapping(value="/InsertSupplier",method=RequestMethod.POST)
	public String insertSupplier(@RequestParam("supplierName")String supplierName,@RequestParam("supplierDesc")String supplierDesc,Model m)
	{
		Supplier supplier=new Supplier();
		supplier.setSupplierName(supplierName);
		supplier.setSupplierDesc(supplierDesc);
		
		supplierDAO.addSupplier(supplier);
		
		List<Supplier>supplierList=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",supplierList);
		
		System.out.println("---Insert the supplier and list it---");
		return "Supplier";
	}
	
	@RequestMapping(value="/EditSupplier/{supplierId}")
	public String editSupplier(@PathVariable("supplierId")int supplierId,Model m) 
	{
		Supplier supplier=supplierDAO.getSupplier(supplierId);
		
		m.addAttribute("supplier",supplier);
		
		System.out.println("---Edit the Supplier---");
		
		return "UpdateSupplier";
	}
	
	@RequestMapping(value="/DeleteSupplier/{supplierId}")
	public String deleteSupplier(@PathVariable("supplierId")int supplierId,Model m)
	{
		Supplier supplier=supplierDAO.getSupplier(supplierId);
		supplierDAO.deleteSupplier(supplier);
		
		System.out.println("---Delete the Supplier---");
		
		List<Supplier>supplierList=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",supplierList);
        
		System.out.println("-----Displaying the spplier list after deleting-----");
		
 		 return "Supplier";
	}
	
	@RequestMapping(value="/UpdateSupplier",method=RequestMethod.POST)
	public String updateSupplier(@RequestParam("supplierId")int supplierId,@RequestParam("supplierName")String supplierName,@RequestParam("supplierDesc")String supplierDesc,Model m)
	{
		Supplier supplier=supplierDAO.getSupplier(supplierId);
		supplier.setSupplierName(supplierName);
		supplier.setSupplierDesc(supplierDesc);
		
		supplierDAO.updateSupplier(supplier);
		
		List<Supplier>supplierList=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",supplierList);
		
		System.out.println("---Updated supplier List---");
		return "Supplier";
	}

}
