package com.malonwright.ProductsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malonwright.ProductsAndCategories.models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	List<User> findAll();

}
