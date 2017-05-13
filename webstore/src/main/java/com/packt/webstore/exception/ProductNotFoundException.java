package com.packt.webstore.exception;


public class ProductNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1439305645513365011L;
	
	private String productId;

	public ProductNotFoundException(String productId) {
		
		this.setProductId(productId);
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	

}
