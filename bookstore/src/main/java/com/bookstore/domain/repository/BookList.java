package com.bookstore.domain.repository;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class BookList implements Serializable {

	private String cartId;

	private List<BookItem> bookItems;

	public BookList(String cartId) {
		super();
		this.cartId = cartId;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public List<BookItem> getBookItems() {
		return bookItems;
	}

	public void setBookItems(List<BookItem> bookItems) {
		this.bookItems = bookItems;
	}

	public BookItem getBookItemByID(String id) {

		return bookItems.stream().filter(bookItem -> bookItem.getBook().getBookId().equals(id))
				.findAny().orElse(null);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartId == null) ? 0 : cartId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookList other = (BookList) obj;
		if (cartId == null) {
			if (other.cartId != null)
				return false;
		} else if (!cartId.equals(other.cartId))
			return false;
		return true;
	}

}
