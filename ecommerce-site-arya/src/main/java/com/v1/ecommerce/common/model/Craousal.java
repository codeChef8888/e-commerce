package com.v1.ecommerce.common.model;

public class Craousal {
	
	private Long id;

	private String image_url;
	
	public Craousal() {

		
	}

	public Craousal(Long id, String image_url) {
		super();
		this.id = id;
		this.image_url = image_url;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

}
