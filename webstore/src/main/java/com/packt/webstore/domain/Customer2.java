package com.packt.webstore.domain;

import java.io.Serializable;

public class Customer2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5978150870799113743L;
	private Long customerId;
	private String name;
	private Adress billingAdress;
	private String phoneNumber;

	public Customer2() {
		super();
		this.billingAdress = new Adress();
	}

	public Customer2(Long customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adress getBillingAdress() {
		return billingAdress;
	}

	public void setBillingAdress(Adress billingAdress) {
		this.billingAdress = billingAdress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
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
		Customer2 other = (Customer2) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		return true;
	}

}
