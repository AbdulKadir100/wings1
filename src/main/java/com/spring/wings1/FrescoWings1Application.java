package com.spring.wings1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Model.Cart;
import Model.CartProduct;
import Model.Category;
import Model.Product;
import Model.Role;
import Model.User;

@SpringBootApplication
public class FrescoWings1Application {
    private static User us=null;
	public static void main(String[] args) {
		SpringApplication.run(FrescoWings1Application.class, args);
		
		List<Role> roles = new ArrayList<>();
		roles.add(new Role("CONSUMER"));
		roles.add(new Role("SELLER"));
		//System.out.println(roles);
		
		System.out.println("**************** ROLES ***************");
		for(Role r : roles) {
			System.out.println(" "+r.getRole().toString());
		}
		
		List<Category> categories = new ArrayList<>();
		categories.add(new Category(1,"Fashion"));
		categories.add(new Category(2,"Electronics"));
		categories.add(new Category(3,"Books"));
		categories.add(new Category(4,"Groceries"));
		categories.add(new Category(5,"Medicines"));
		
		System.out.println("**************** CATEGORIES ***************");
		for(Category c : categories) {
			System.out.println(" "+c.getCategoryName().toString());
		}
		
		List<User> users = new ArrayList<>();
		users.add(new User("jack","pass_word"));
		users.add(new User("bob","pass_word"));
		users.add(new User("apple","pass_word"));
		users.add(new User("glaxo","pass_word"));
		
		System.out.println("**************** USER ***************");
		for(User u:users) {
			System.out.println(" "+u.getUsername()+" ,"+u.getPassword());
		}
		
		List<Cart> cart = new ArrayList<>();
		cart.add(new Cart(20,new User(1)));
		cart.add(new Cart(0,new User(2)));
		
		System.out.println("**************** CART ***************");
		for(Cart c:cart) {
			System.out.println(" "+c.getTotalAmount()+", "+c.getUser().getUserId());
		}
		
		
		List<Product> products = new ArrayList<>();
		Category cat1 = new Category();
		cat1.setCategoryId(2);
		User selid = new User();
		selid.setUserId(3);
		products.add(new Product(29190,"Apple iPad",selid,cat1));
		Category cat2 = new Category();
		cat2.setCategoryId(5);
		selid.setUserId(4);
		products.add(new Product(10,"Crocin",selid,cat2));
		
		System.out.println("**************** PRODUCTS ***************");
	    for(Product p:products) {
	    	System.out.println(" "+p.getPrice()+", "+p.getProductName()+", "+p.getCategory().getCategoryId()+
	    			", "+p.getSeller().getUserId());
	    }
		
		List<CartProduct> cartProducts = new ArrayList<>();
		Product prd = new Product();
		prd.setProductId(2);
		cartProducts.add(new CartProduct(1,prd,2));
		//System.out.println(cartProducts);
		
		System.out.println("**************** CART PRODUCTS ***************");
		for(CartProduct cp:cartProducts) {
			System.out.println(" "+cp.getCpId()+", "+cp.getProduct().getProductId()
					+", "+cp.getQuantity());
		}
	}

}
