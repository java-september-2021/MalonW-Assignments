package com.malonwright.ProductsAndCategories.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.malonwright.ProductsAndCategories.models.Category;
import com.malonwright.ProductsAndCategories.models.Product;
import com.malonwright.ProductsAndCategories.services.CategoryService;
import com.malonwright.ProductsAndCategories.services.ProductService;

public class HomeController {
	
	@Autowired
	private ProductService pService;
	
	@Autowired
	private CategoryService cService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("products")Product product,Category category, Model viewModel) {
		viewModel.addAttribute("product",this.pService.getAllProducts());
		viewModel.addAttribute("category",this.cService.getAllCategories());
		return "/index.jsp";
	}
	//Show Blank Form and List with Current Products
	@GetMapping("/products/newProd")
	public String ProductIndex(@ModelAttribute("product")Product product, Model viewModel ) {
		viewModel.addAttribute("product",this.pService.getAllProducts());
		return "/products/newProduct.jsp";
	}
	
	//Create Product
	@PostMapping("/products/create")
	public String createProduct(@Valid @ModelAttribute("product")Product product,BindingResult result) {
		if(result.hasErrors()) {
			return "/products/newProduct.jsp";
		}
		pService.createProduct(product);
		return "redirect:/";
	}
	
	//Show Blank Form for Categories
	@GetMapping("/categories/newCat")
	public String categoryIndex(@ModelAttribute("category")Category category, Model viewModel) {
		viewModel.addAttribute("category", this.cService.getAllCategories());
		return "/categories/newCat.jsp";
	}
	//Create Category
	@PostMapping("/categories/create")
	public String createCategory(@Valid @ModelAttribute("category")Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "/categories/newCat.jsp";
		}
		cService.createCategory(category);
		return "redirect:/";
	}
	
	//Product Details
	@GetMapping("/products/details/{id}")
	public String productDetails(@PathVariable("id")Long id,Model viewModel,Product product) {
		Long idProd = product.getId();
		viewModel.addAttribute("product", this.pService.getOneProduct(id));
		viewModel.addAttribute("product", this.cService.Categories(product));
		viewModel.addAttribute("product", this.cService.NotIncludedCats(product));
		return "redirect:/products/ProductDetail"+idProd;
	}
	//Add Category to Product
	@GetMapping("/products/add")
	public String AddCat(@ModelAttribute("product")Product product) {
		Long idProd = product.getId();
		pService.createProduct(product);
		
		return "redirect:/products/details/" + idProd;
	}
}
