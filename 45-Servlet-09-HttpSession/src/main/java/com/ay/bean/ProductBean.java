package com.ay.bean;

import java.io.Serializable;

public class ProductBean implements Serializable {

	private String id, name;
	private Integer qty;
	private Float price;

	public ProductBean() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}

}
