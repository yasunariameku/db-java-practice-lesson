package main.java.jp.co.axiz.entity;

public class Product {
	
	private Integer product_id;
	private String product_name;
	private Integer price;
	
	public Product() {
	}

	public Product(Integer product_id, String product_name, Integer price) {
	    //this.product_id = product_id;
	    this.product_name = product_name;
	    this.price = price;
	}
	
	public 

	@Override
	public String toString() {
		return "Product product_id=" + product_id + "<br> product_name=" + product_name + "<br> price=" + price ;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
