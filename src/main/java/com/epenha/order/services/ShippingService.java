package com.epenha.order.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epenha.order.entities.Order;

@Service
public class ShippingService {
	
	private final double ABAIXO_CEM = 20.00;
	private final double ENTRE_CEM_E_DUZENTOS = 12.00;
	
	@Autowired
	private OrderService orderService;
	
	public double shipment(Order order) {
		double shipping;
		double totalOrder = orderService.total(order);
		
		if(totalOrder < 100) {
			shipping = totalOrder + ABAIXO_CEM;
		} else if(totalOrder >= 100 && totalOrder <= 200) {
			shipping = totalOrder + ENTRE_CEM_E_DUZENTOS;
		} else {
			shipping = totalOrder;
		}
		return shipping;
	}

}
