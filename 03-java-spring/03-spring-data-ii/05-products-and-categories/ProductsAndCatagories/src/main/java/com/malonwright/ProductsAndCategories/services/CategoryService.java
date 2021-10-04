package com.malonwright.ProductsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malonwright.ProductsAndCategories.models.Category;
import com.malonwright.ProductsAndCategories.models.Product;
import com.malonwright.ProductsAndCategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cRepo;
	
	//Get ALL
	public List<Category> getAllCategories(){
		return this.cRepo.findAll();
	}
	
	//Get one Cat
	public Category getOneCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	//Create
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	//Categories
	public List<Category> Categories(Product product){
		return this.cRepo.findAllByProducts(product);
	}
	
	//Containing Products
	public List<Category> NotIncludedCats(Product product){
		return this.cRepo.findByProductsNotContains(product);
	}
//	add Product to category and save
	public void addProductToCategory(Category category, Product product) {
		category.getProducts().add(product);
		this.cRepo.save(category);
	}
}
