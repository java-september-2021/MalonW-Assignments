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
			return "/index.jsp";
		} else {
		this.uService.createUser(user);
		return "redirect:/";
		}
	}
	
	//home page with Products and categories
	@GetMapping("/home")
	public String index(@ModelAttribute("products")Product product,Category category, Model viewModel, HttpSession session) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		viewModel.addAttribute("user", this.uService.getOneUser((Long)session.getAttribute("user_id")));
		viewModel.addAttribute("products",this.pService.getAllProducts());
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
		
		//User UnFavorites
		@GetMapping("/unfavorite/{id}")
		public String userUnFavorites(@PathVariable("id") Long id, HttpSession session) {
			User userSelected = this.uService.getOneUser((Long)session.getAttribute("user_id"));
			Product productSelected = this.pService.getOneProduct(id);
			this.pService.UserUnFavorites(userSelected, productSelected);
			return "redirect:/home";
		}
			
		
	
//	Products
	//Show Blank Form and List with Current Products
	@GetMapping("/products/addProd")
	public String ProductIndex(@ModelAttribute("product")Product product, Model viewModel ) {
		
		viewModel.addAttribute("products",this.pService.getAllProducts());
		return "/products/newProduct.jsp";
	}
	
	
	
	//Create Product
	@PostMapping("/products/create")
	public String createProduct(@Valid @ModelAttribute("product")Product product,BindingResult result) {
		
		if(result.hasErrors()) {
			return "/products/newProduct.jsp";
		}
		pService.createProduct(product);
		return "redirect:/home";
	}
	
	
	
//Category	
	//Show Blank Form for Categories
	@GetMapping("/categories/addCat")
	public String categoryIndex(@ModelAttribute("category")Category category, Model viewModel) {
		viewModel.addAttribute("categories", this.cService.getAllCategories());
		return "/categories/newCat.jsp";
	}

	//Create Category
	@PostMapping("/categories/create")
	public String createCategory(@Valid @ModelAttribute("category")Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "/categories/addCat.jsp";
		}
		cService.createCategory(category);
		return "redirect:/home";
	}
	//Show Cat Details
	@GetMapping("/categories/details/{id}")
	public String catDetails(@PathVariable("id")Long id, Model viewModel) {
		viewModel.addAttribute("category", this.cService.getOneCategory(id));
		List<Product> notInProduct = this.pService.getProductNotInCategory(this.cService.getOneCategory(id));
		viewModel.addAttribute("notInProduct", notInProduct);
	
		return "/categories/CatDetails.jsp";
	}
	//Add Product to Category
	@PostMapping("/categories/addprodCat/{id}")
	public String addProdToCat(@ModelAttribute("category")Long id, @PathVariable("id") Long categoryId) {
		Product productSelected = this.pService.getOneProduct(id);
		Category catSelected = this.cService.getOneCategory(categoryId);
		this.cService.addProductToCategory(catSelected, productSelected);
		
		return "redirect:/categories/details/"+categoryId;

	}
	//Product Details
	@GetMapping("/products/details/{id}")
	public String productDetails(@PathVariable("id")Long id,Model viewModel) {
			viewModel.addAttribute("product", this.pService.getOneProduct(id));
			List<Category> notInCat = this.cService.NotIncludedCats(this.pService.getOneProduct(id));
			viewModel.addAttribute("notInCat", notInCat);
			
		return "/products/ProductDetails.jsp";
	}
	//Add Category to Product
	@PostMapping("/products/addcatProd/{id}")
	public String AddcatProd(@ModelAttribute("product")Long prodId, @PathVariable("category") Long catId ) {
		
		Product productSelected = this.pService.getOneProduct(prodId);
		Category categorySelected = this.cService.getOneCategory(catId);
		this.pService.addCatToProd(categorySelected, productSelected);
				
		return "redirect:/products/details/" + prodId;

	}
	
}