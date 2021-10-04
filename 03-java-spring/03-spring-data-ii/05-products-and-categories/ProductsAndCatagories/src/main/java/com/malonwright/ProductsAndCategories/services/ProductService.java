package com.malonwright.ProductsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malonwright.ProductsAndCategories.models.Product;
import com.malonwright.ProductsAndCategories.repositories.ProductRepository;



@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	
	//Get All
	public List<Product> getAllProducts(){
		return this.pRepo.findAll();
	}
	
	//Get One Product
	public Product getOneProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	//create
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
}
	

