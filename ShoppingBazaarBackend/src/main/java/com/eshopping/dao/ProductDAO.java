package com.eshopping.dao;

import java.util.List;

import com.eshopping.model.Product;

public interface ProductDAO {

	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateProduct(Product product);
	public Product getProduct(int ProductId);
	public List<Product>listProducts();
}
