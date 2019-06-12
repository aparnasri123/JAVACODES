package com.eshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eshopping.dao.CartDAO;
import com.eshopping.dao.ProductDAO;
import com.eshopping.model.Cart;
import com.eshopping.model.Product;
@Controller
public class CartController {
@Autowired
CartDAO cartDAO;

@Autowired
ProductDAO productDAO;

@RequestMapping("/addToCart/{productId}")
public String addToCart(@PathVariable("productId")int productId,@RequestParam("quantity")int quantity,Model m) 
{

	String username="Aparna";
	Product product=productDAO.getProduct(productId);
	Cart cart=new Cart();
	cart.setProductId(product.getProductId());
	cart.setProductName(product.getProductName());
	cart.setQuantity(quantity);
	cart.setPrice(product.getPrice());
	cart.setUsername(username);
	cart.setStatus("NP");
	cartDAO.addToCart(cart);
	List<Cart>listCartItems=cartDAO.listCartItems(username);
	m.addAttribute("cartItems",listCartItems);
	m.addAttribute("grandTotal",this.calcGrandTotal(listCartItems));
	
		return "Cart";
	}

  public int calcGrandTotal(List<Cart> listCartItems) {
	int count=0,grandTotal=0;
	
	while(count<listCartItems.size())
	{
		grandTotal=grandTotal+(listCartItems.get(count).getQuantity()*listCartItems.get(count).getPrice());
		count++;
	}
	return grandTotal;
  }
	
	
	
}
