package com.v1.ecommerce.common.model;

import java.util.List;




public class Index {
	private String logo;

	private List<Menus> menus;

	private List<SubMenus> subMenus;
	
	private List<Craousal> craousal;

	private List<Items> items;
	
	private Contact contact;
	
	
	
	public Index() {
		
	}

	public Index(String logo, List<Menus> menus, List<Craousal> crausal, List<Items> items, Contact contact) {
		this.logo = logo;
		this.menus = menus;
		this.craousal = crausal;
		this.items = items;
		this.contact=contact;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public List<Menus> getMenus() {
		return menus;
	}

	public void setMenus(List<Menus> menus) {
		this.menus = menus;
	}
	
	

	public List<SubMenus> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<SubMenus> subMenus) {
		this.subMenus = subMenus;
	}

	public List<Craousal> getCraousal() {
		return craousal;
	}

	public void setCraousal(List<Craousal> crausal) {
		this.craousal = crausal;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
}
