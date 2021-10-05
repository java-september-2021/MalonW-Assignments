package com.malonwright.ProductsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malonwright.ProductsAndCategories.models.Category;
import com.malonwright.ProductsAndCategories.models.Product;
import com.malonwright.ProductsAndCategories.models.User;
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
//	Products not in specific category
	public List<Product> getProductNotInCategory(Category category){
		return this.pRepo.findByCategoriesNotContains(category);
	}
//	Add Product to Cat
	public void addCatToProd(Category category, Product product) {
		product.getCategories().add(category);
		this.pRepo.save(product);
	}
	
	//adding Like to products From Users
	public void LikeProduct(User user, Product product) {
		product.getUserLiked().add(user);
		this.pRepo.save(product);
	}
	
	public void UserUnlikes(User user, Product product) {
		product.getUserLiked().remove(user);
		this.pRepo.save(product);
	}
}
	

