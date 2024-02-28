package com.citizens.accounts.model;

public class ProductChangeRequest {
	private String customerType;
	private String accountType;
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "ProductChangeRequest [customerType=" + customerType + ", accountType=" + accountType + "]";
	}
	
	 
	
}
