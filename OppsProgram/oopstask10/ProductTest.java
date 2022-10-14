package com.yash.java.oopstask10;

public class ProductTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Product product = new Product(101, "Mobile", 200000, 10);
		System.out.println("original value: "+product);
		
		Product copyProduct = (Product) product.clone();
		copyProduct.setPname("Laptop");
		copyProduct.setPrice(550000);
		System.out.println("after clonning: "+copyProduct);
		
		if(copyProduct instanceof Product) {
			System.out.println("new object is belongs to Product class");
		}else {
			System.out.println("new object is not beongs to Product class");
		}
	}
}
