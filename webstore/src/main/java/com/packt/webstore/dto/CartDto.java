package com.packt.webstore.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CartDto  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7758401659674018902L;
	
	private String id;
	
	private List<CartItemDto>  cartItems;
	
	public CartDto() {}
	
	public CartDto(String id) {
		this.id = id;
		cartItems = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<CartItemDto> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItemDto> cartItems) {
		this.cartItems = cartItems;
	}
	
	
	
	public void addCartItems(CartItemDto cartItemDto){
		this.cartItems.add(cartItemDto);
	}

}
