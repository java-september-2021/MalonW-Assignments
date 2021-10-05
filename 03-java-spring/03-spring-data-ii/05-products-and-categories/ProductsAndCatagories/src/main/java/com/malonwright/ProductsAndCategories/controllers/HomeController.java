package com.malonwright.ProductsAndCategories.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.malonwright.ProductsAndCategories.models.Category;
import com.malonwright.ProductsAndCategories.models.Product;
import com.malonwright.ProductsAndCategories.models.User;
import com.malonwright.ProductsAndCategories.services.CategoryService;
import com.malonwright.ProductsAndCategories.services.ProductService;
import com.malonwright.ProductsAndCategories.services.UserService;


@Controller
public class HomeController {
	
	@Autowired
	public ProductService pService;
	
	@Autowired
	public CategoryService cService;
	
	@Autowired
	public UserService uService;
	
	//User
//	New Index Page
	@GetMapping("/")
	public String getUser(@ModelAttribute("user") User user,Model viewModel) {
		viewModel.addAttribute("allUsers", this.uService.getAllUsers());
		return"/index.jsp";
	}
//	Create User
	@PostMapping("/user/new")
	public String createUser(@Valid @ModelAttribute("user") User user,BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
		this.uService.createUser(user);
		return "reirect:/";
		}
	}
	
	//home page with Products and categories
	@GetMapping("/home")
	public String index(@ModelAttribute("products")Product product,Category category, Model viewModel) {
		viewModel.addAttribute("product",this.pService.getAllProducts());
		viewModel.addAttribute("category",this.cService.getAllCategories());
		return "/home.jsp";
	}
	
	//Need user login/logout
	
	//Login 
		@PostMapping("/login")
		public String ToLogIn(@RequestParam("userToLogin") Long id, HttpSession session) {
			session.setAttribute("user_id", id);
			return "redirect:/home";
		}
		//Logout
		@GetMapping("/logout")
		public String ToLogout(HttpSession session) {
			session.invalidate();
			return"redirect:/";
		}
		//need user favorite unfavorite
		//User Likes
		
		@GetMapping("/favorite/{id}")
		public String userFavorite(@PathVariable("id") Long id, HttpSession session) {
			User userSelected = this.uService.getOneUser((Long)session.getAttribute("user_id"));
			Product productSelected = this.pService.getOneProduct(id);
			this.pService.UserFavorites(userSelected, productSelected);
			return "redirect:/home";
		}
		
		//User UnLikes
		@GetMapping("/unfavorite/{id}")
		public String userUnFavorites(@PathVariable("id") Long id, HttpSession session) {
			User userSelected = this.uService.getOneUser((Long)session.getAttribute("user_id"));
			Product productSelected = this.pService.getOneProduct(id);
			this.pService.UserUnFavorites(userSelected, productSelected);
			return "redirect:/home";
		}
			
		
	
//	Products
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
	
	
	//Product Details
	@GetMapping("/products/details/{id}")
	public String productDetails(@PathVariable("id")Long id,Model viewModel) {
			viewModel.addAttribute("product", this.pService.getOneProduct(id));
			List<Category> notInCat =this.cService.NotIncludedCats(this.pService.getOneProduct(id));
			viewModel.addAttribute("notInCat", notInCat);
			
		return "redirect:/products/ProductDetail"+id;
	}
	//Add Category to Product
	@PostMapping("/products/addprodCat/{id}")
	public String AddCat(@RequestParam("category")Long id,@PathVariable("id")Long prodId) {
		
		Product productSelected = this.pService.getOneProduct(prodId);
		Category categorySelected = this.cService.getOneCategory(id);
		this.pService.addCatToProd(categorySelected, productSelected);
		
		return "redirect:/products/details/" + prodId;
	}
//Category	
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
	//Show Cat Details
	@GetMapping("/categories/details/{id}")
	public String catDetails(@PathVariable("id")Long id, Model viewModel) {
		viewModel.addAttribute("category", this.cService.getOneCategory(id));
		List<Product> notInProduct = this.pService.getProductNotInCategory(this.cService.getOneCategory(id));
		viewModel.addAttribute("notInProduct", notInProduct);
	
		return "/categories/detials/"+id;
	}
	//Add Product to Category
	public String addCatToProd(@RequestParam("product")Long id, @PathVariable("id") Long categoryId) {
		Product productSelected = this.pService.getOneProduct(id);
		Category catSelected = this.cService.getOneCategory(categoryId);
		this.cService.addProductToCategory(catSelected, productSelected);
	return "redirect:/categories/details/"+categoryId;

	}
	
	
	
	
}