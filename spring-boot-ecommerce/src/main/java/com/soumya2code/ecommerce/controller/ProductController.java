package com.soumya2code.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumya2code.ecommerce.dao.ProductRepository;
import com.soumya2code.ecommerce.entity.Product;

@RestController
//@CrossOrigin("http://localhost:4200")
public class ProductController {
	
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> getUsers(){
		return productRepository.findAll();
	}
	
	@PostMapping("/add")
	public void createProduct(@RequestBody Product product) {
		productRepository.save(product);
	}
	
	@GetMapping("/purchase")
	public String dummy() {
		System.out.println("hhhhhhh");
		return "I'm running";
	}

}
