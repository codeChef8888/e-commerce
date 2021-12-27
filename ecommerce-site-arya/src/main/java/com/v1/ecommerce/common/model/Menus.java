package com.v1.ecommerce.common.model;




public class Menus {
private Long id;
	
	private String name;
	
	private String url_link;

	public Menus(){

		
	} 
	
	public Menus(Long id, String name,String url_link) {

		this.id = id;
		this.name = name;
		this.url_link=url_link;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl_link() {
		return url_link;
	}

	public void setUrl_link(String url_link) {
		this.url_link = url_link;
	} 
	
	
}
