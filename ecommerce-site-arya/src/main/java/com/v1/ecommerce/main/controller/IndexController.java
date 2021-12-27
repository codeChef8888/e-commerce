package com.v1.ecommerce.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.v1.ecommerce.common.model.Contact;
import com.v1.ecommerce.common.model.Craousal;
import com.v1.ecommerce.common.model.Index;
import com.v1.ecommerce.common.model.Items;
import com.v1.ecommerce.common.model.Menus;
import com.v1.ecommerce.common.model.SubMenus;

@Controller
@RequestMapping("/v1")
public class IndexController {

	@GetMapping("/index")
	public String index(Model model) {

		Index index = new Index();

		List<Menus> menu_list = new ArrayList<>();
		menu_list.add(new Menus((long) 1, "About Us.", "#"));
		menu_list.add(new Menus((long) 2, "Contact Us.", "#"));
		menu_list.add(new Menus((long) 3, "Category", "#"));
		menu_list.add(new Menus((long) 4, "location", "#"));

		List<Craousal> craousal_list = new ArrayList<>();

		craousal_list.add(new Craousal((long) 1,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602579973/ecom/images/heritage1_gfliwg.jpg"));
		craousal_list.add(new Craousal((long) 2,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602579975/ecom/images/heritage2_udaske.jpg"));
		craousal_list.add(new Craousal((long) 3,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602579976/ecom/images/heritage3_ot0mhs.jpg"));

		Contact contact = new Contact("Urlabari Jhapa Nepal", "crafts@nepal.com","021-556565","9875646907");
		
		
		index.setLogo("https://res.cloudinary.com/ddiej3lms/image/upload/v1602579958/ecom/logo/logo1_vsfw08.jpg");
		index.setMenus(menu_list);
		index.setCraousal(craousal_list);
		index.setContact(contact);

		model.addAttribute("index", index);

		return "index2";

	}

	@GetMapping("/index1")
	public String index1(Model model) {

		Index index = new Index();

		List<Items> item_list = new ArrayList<>();
		item_list.add(new Items((long) 1, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594370/ecom/products/product1_fcizrc.jpg",
				"blah1"));
		item_list.add(new Items((long) 2, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594368/ecom/products/product12_io6cph.jpg",
				"blah2"));
		item_list.add(new Items((long) 3, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594366/ecom/products/product11_kbebip.jpg",
				"blah3"));
		item_list.add(new Items((long) 4, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594364/ecom/products/product10_yl0rc9.jpg",
				"blah4"));
		item_list.add(new Items((long) 5, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594362/ecom/products/product9_rb87yh.jpg",
				"blah5"));
		item_list.add(new Items((long) 6, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594360/ecom/products/product8_lymyys.jpg",
				"blah6"));
		item_list.add(new Items((long) 7, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594358/ecom/products/product7_z8rpfy.jpg",
				"blah7"));
		item_list.add(new Items((long) 8, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594356/ecom/products/product6_qh1cne.jpg",
				"blah8"));
		item_list.add(new Items((long) 9, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594355/ecom/products/product5_m80ukq.jpg",
				"blah9"));
		item_list.add(new Items((long) 10, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594354/ecom/products/product4_iganui.jpg",
				"blah10"));
		item_list.add(new Items((long) 11, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594353/ecom/products/product2_dcahck.png",
				"blah11"));
		item_list.add(new Items((long) 12, "handicraft", 100, 10, 10,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602594353/ecom/products/product3_ratfaq.jpg",
				"blah12"));

		List<Menus> menu_list = new ArrayList<>();
		menu_list.add(new Menus((long) 1, "About Us.", "#"));
		menu_list.add(new Menus((long) 2, "Contact Us.", "#"));
		menu_list.add(new Menus((long) 3, "Category", "#"));
		menu_list.add(new Menus((long) 4, "location", "#"));

		List<SubMenus> sub_menu_list = new ArrayList<>();
		sub_menu_list.add(new SubMenus((long) 1, "Custom Designing", "#"));
		sub_menu_list.add(new SubMenus((long) 1, "Handicrafts Features", "#"));
		sub_menu_list.add(new SubMenus((long) 1, "Handicraft Quality", "#"));
		sub_menu_list.add(new SubMenus((long) 1, "Testimonials", "#"));
		sub_menu_list.add(new SubMenus((long) 1, "Handicrafts Catalog", "#"));
		sub_menu_list.add(new SubMenus((long) 1, "Handicrafts Maintanance", "#"));

		List<Craousal> craousal_list = new ArrayList<>();

		craousal_list.add(new Craousal((long) 1,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602579973/ecom/images/heritage1_gfliwg.jpg"));
		craousal_list.add(new Craousal((long) 2,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602579975/ecom/images/heritage2_udaske.jpg"));
		craousal_list.add(new Craousal((long) 3,
				"https://res.cloudinary.com/ddiej3lms/image/upload/v1602579976/ecom/images/heritage3_ot0mhs.jpg"));

		index.setLogo("https://res.cloudinary.com/ddiej3lms/image/upload/v1602579958/ecom/logo/logo1_vsfw08.jpg");
		index.setItems(item_list);
		index.setMenus(menu_list);
		index.setSubMenus(sub_menu_list);
		index.setCraousal(craousal_list);

		model.addAttribute("index", index);

		return "index";
	}
}
