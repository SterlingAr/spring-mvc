package com.bookstore;

import java.util.UUID;

public class GenUUID {

	public static void main(String[] args) {
		for (int i = 0 ; i < 10 ; i++) {
			UUID uid = UUID.randomUUID();
			System.out.println(uid);
		}
	}

}
