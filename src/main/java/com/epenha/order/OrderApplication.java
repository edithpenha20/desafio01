package com.epenha.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.epenha.order.entities.Order;
import com.epenha.order.services.ShippingService;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {
	
	@Autowired
	private ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(2282, 800.00, 10.0);
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: " + shippingService.shipment(order));
	}

}
