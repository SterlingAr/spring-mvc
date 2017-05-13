package com.packt.webstore.validator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.packt.webstore.domain.Product;
import com.packt.webstore.service.ProductService;

@Component
public class ProductConditionValidator implements Validator{
	
	@Autowired
	private ProductService productService;

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Product.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Product product = (Product) target;
	
		try {
			
			if(product.getCondition() == null){
				errors.rejectValue("condition", "com.packt.webstore.validator.ProductConditionValidator.message");
			}
			
		} catch (NullPointerException e) {
			
		}
		
		
		
		
		
	}

}
