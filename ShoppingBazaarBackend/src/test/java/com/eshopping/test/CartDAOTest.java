package com.eshopping.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eshopping.dao.CartDAO;
import com.eshopping.model.Cart;

public class CartDAOTest {
	
static CartDAO cartDAO;

@BeforeClass
public static void executeFirst() {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.eshopping");
	context.refresh();
	cartDAO=(CartDAO)context.getBean("cartDAO"); 
}

@Ignore
@Test
public void addToCartTest()
{
	Cart cart=new Cart();
	cart.setPrice(56000);
	cart.setProductId(117);
	cart.setProductName("VoltasSplitAC");
	cart.setQuantity(3);
	cart.setUsername("Aparna");
	cart.setStatus("NP");
	assertTrue("problem in adding cart",cartDAO.addToCart(cart));
}
@Ignore
@Test
public void deleteFromCartTest(){
	Cart cart=cartDAO.getCartItem(2);
	assertTrue("problem in adding cart",cartDAO.deleteItemFromCart(cart));
}
@Ignore
@Test
public void updateCartItemTest() {
	Cart cart=cartDAO.getCartItem(4);
	cart.setQuantity(5);
	assertTrue("problem in updating the cartItem",cartDAO.updateCartItem(cart));
}

@Test
public void listCartItemTest() {
	List<Cart> cartItemList=cartDAO.listCartItems("Aparna");
	assertTrue("problem in listing cartItems",cartItemList.size()>0);
	for(Cart cart:cartItemList) {
		System.out.print(cart.getCartId()+"\t");
		System.out.print(cart.getProductName()+"\t");
		System.out.print(cart.getQuantity()+"\t");
		System.out.print(cart.getPrice()+"\t");
		System.out.println(cart.getStatus()+"\t");
	}
}

}
