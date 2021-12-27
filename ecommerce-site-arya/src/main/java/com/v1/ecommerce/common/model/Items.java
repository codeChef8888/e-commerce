package com.v1.ecommerce.common.model;




public class Items {
	private Long id;
	
	private String category;
	
	private int price;
	
	private int tax;
	
	private int vat;
	
	private String image_url;
	
	private String name;
	
	public Items() {


	} 

	public Items(Long id, String category, int price, int tax, int vat, String image_url, String name) {

		this.id = id;
		this.category = category;
		this.price = price;
		this.tax = tax;
		this.vat = vat;
		this.image_url = image_url;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	
	
}
