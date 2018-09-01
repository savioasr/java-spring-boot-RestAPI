package com.allin.RestAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allin.RestAPI.models.Product;
import com.allin.RestAPI.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public List<Product> findAll() {
		
		return this.productRepository.findAll();
	}

	@Override
	public Optional<Product> find(Long id) {
		
		return this.productRepository.findById(id);
	}

	@Override
	public Product create(Product product) {
		
		this.productRepository.save(product);
		
		return product;
	}

	@Override
	public Product update(Long id, Product product) {
		
		Optional<Product> productExists = this.productRepository.findById(id);
		
		if( productExists.isPresent() ) {
			
			product.setId(id);
			
			this.productRepository.save(product);
			
			return product;
		}
		
		return null;
	}

	@Override
	public void delete(Long id) {
		
		Optional<Product> productExists = this.productRepository.findById(id);
		
		if( productExists.isPresent() ) {
			
			this.productRepository.deleteById(id);
		}
	}
}