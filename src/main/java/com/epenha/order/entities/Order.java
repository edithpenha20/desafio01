package com.epenha.order.entities;

public class Order {
	
	int code;
	double value;
	double discount;
	
	public Order(int code, double value, double discount) {
		this.code = code;
		this.value = value;
		this.discount = discount;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getDiscount() {
		return discount/100;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
