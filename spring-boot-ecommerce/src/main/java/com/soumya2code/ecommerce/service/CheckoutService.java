package com.soumya2code.ecommerce.service;

import com.soumya2code.ecommerce.dto.Purchase;
import com.soumya2code.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}