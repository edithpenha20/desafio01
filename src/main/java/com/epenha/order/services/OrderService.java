package com.epenha.order.services;

import org.springframework.stereotype.Service;

import com.epenha.order.entities.Order;

@Service
public class OrderService {
	
	public double total(Order order) {
		return order.getValue() - (order.getValue() * order.getDiscount());
	}

}
