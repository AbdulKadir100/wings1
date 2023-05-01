package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CartProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cpId;
	private Cart cart;
	private Product product;
	private int quantity;
	public int getCpId() {
		return cpId;
	}
	
	public CartProduct() {
	}

    public CartProduct(int cpId, Product product, int quantity) {
		this.cpId = cpId;
		this.product = product;
		this.quantity = quantity;
	}



	public void setCpId(int cpId) {
		this.cpId = cpId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartProduct [cpId=" + cpId + ", cart=" + cart + ", product=" + product + ", quantity=" + quantity + "]";
	}
	
	

}
