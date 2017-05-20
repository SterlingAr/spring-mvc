package com.bookstore;

import java.util.UUID;

public class CreateUUID {
	
	public static void main(String[] args ){
		
		for (int i = 0 ; i < 10; i++) {
			
			UUID tempVar = UUID.randomUUID();
			System.out.println(tempVar);
			
		}
		
	}

}
