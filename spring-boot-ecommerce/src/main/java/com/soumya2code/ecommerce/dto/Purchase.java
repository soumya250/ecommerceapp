package com.soumya2code.ecommerce.dto;


import com.soumya2code.ecommerce.entity.Address;
import com.soumya2code.ecommerce.entity.Customer;
import com.soumya2code.ecommerce.entity.Order;
import com.soumya2code.ecommerce.entity.OrderItem;

import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}