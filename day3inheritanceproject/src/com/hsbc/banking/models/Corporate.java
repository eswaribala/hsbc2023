package com.hsbc.banking.models;

public class Corporate extends Customer{

	private CompanyType companyType;

	public Corporate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Corporate(long customerId, FullName name, Address[] addresses, String email, String password,
			long contactNo, CompanyType companyType) {
		super(customerId, name, addresses, email, password, contactNo);
		// TODO Auto-generated constructor stub
		this.companyType=companyType;
	}

	public CompanyType getCompanyType() {
		return companyType;
	}

	
	
	
}
