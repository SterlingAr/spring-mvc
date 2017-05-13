package com.packt.webstore.domain.repository;

import java.util.List;
import java.util.Map;

import com.packt.webstore.domain.Product;

public interface ProductRepository {
	
	List<Product> getAllProducts();
	void updateStock(String productId, long noOfUnits);
	List<Product> getProductsByCategory(String category);
	List<Product> getProductsByFilter(Map<String,List<String>> filterParams);
	Product getProductById(String productID);
	
	List<Product> getProductsByFilter(String category, String brand, Map<String, List<String>> filterParam);
	void addProduct(Product product);
	
	List<String> allowedCategories();
	List<String> allowedConditions();
	
}
