package com.allin.RestAPI.services;

import java.util.List;
import java.util.Optional;

import com.allin.RestAPI.models.Product;

public interface ProductService {
	
	public List<Product>findAll();
	
	public Optional<Product> find(Long id);
	
	public Product create(Product product);
	
	public Product update(Long id, Product product);
	
	public void delete(Long id);
}