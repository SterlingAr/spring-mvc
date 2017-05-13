package com.packt.webstore.validator;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.packt.webstore.service.ProductService;

public class CategoryValidator implements ConstraintValidator<Category,String>{
	
	@Autowired
	private ProductService productService;

	@Override
	public void initialize(Category constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		List<String> allowedCategories = productService.allowedCategories();
		
		if (allowedCategories.contains(value)){
			return true;
		}else{
			return false;
		}
		
	}

}
