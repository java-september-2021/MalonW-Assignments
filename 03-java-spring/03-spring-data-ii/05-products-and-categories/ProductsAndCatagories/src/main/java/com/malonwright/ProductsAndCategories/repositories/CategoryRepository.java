package com.malonwright.ProductsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malonwright.ProductsAndCategories.models.Category;
import com.malonwright.ProductsAndCategories.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
	List<Category> findAll();
	
	List<Category> findAllByProducts(Product product);
	
	List<Category> findByProductsNotContains(Product product);
}
	