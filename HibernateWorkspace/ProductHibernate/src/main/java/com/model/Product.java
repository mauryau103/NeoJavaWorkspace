package com.model;

//product.java (Pojo class)

public class Product {
	
private int product_id;
private String productname;
private double price;

public Product(int product_id, String productname, double price) {
	super();
	this.product_id = product_id;
	this.productname = productname;
	this.price = price;
}

public Product() {
	super();
}

public int getProduct_id() {
	return product_id;
}

public void setProduct_id(int product_id) {
	this.product_id = product_id;
}

public String getProductname() {
	return productname;
}

public void setProductname(String productname) {
	this.productname = productname;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Product [product_id=" + product_id + ", productname=" + productname + ", price=" + price + "]";
}





}
