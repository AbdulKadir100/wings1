package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	private double totalAmount;
	private User user;
	private CartProduct cartProduct;
	
	public Cart(int cartId, double totalAmount, User user, CartProduct cartProduct) {
		this.cartId = cartId;
		this.totalAmount = totalAmount;
		this.user = user;
		this.cartProduct = cartProduct;
	}
	public Cart(double totalAmount, User user) {
		this.totalAmount = totalAmount;
		this.user = user;
	}

	public Cart() {
		
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CartProduct getCartProduct() {
		return cartProduct;
	}

	public void setCartProduct(CartProduct cartProduct) {
		this.cartProduct = cartProduct;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", totalAmount=" + totalAmount + ", user=" + user + ", cartProduct="
				+ cartProduct + "]";
	}
	
	
	
	

}
