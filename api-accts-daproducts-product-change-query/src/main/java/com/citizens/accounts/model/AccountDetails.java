package com.citizens.accounts.model;

public class AccountDetails {
	
	private String accountType;
	private String productCode;
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountType=" + accountType + ", productCode=" + productCode + "]";
	}
	
}
