package com.soumya2code.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumya2code.ecommerce.dto.Purchase;
import com.soumya2code.ecommerce.service.CheckoutService;

//@CrossOrigin("http://localhost:4200")
@RestController
public class CheckoutController {

	private CheckoutService checkoutService;

	@Autowired
	public CheckoutController(CheckoutService checkoutService) {
		this.checkoutService = checkoutService;
	}

	@PostMapping("/purchase")
	public String placeOrder(@RequestBody Purchase purchase) {

//        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
//
//        return purchaseResponse;
		return "I'm running";
	}

	@GetMapping("/purchase")
	public String placeOrder() {

//        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
//
//        return purchaseResponse;
		return "I'm running";
	}

}