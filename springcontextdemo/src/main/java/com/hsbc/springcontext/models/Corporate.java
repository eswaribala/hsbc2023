package com.hsbc.springcontext.models;

import java.util.Date;

public class Corporate extends Customer {

	private CompanyType companyType;

	public Corporate(CompanyType companyType) {
		super();
		this.companyType = companyType;
	}

	public Corporate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Corporate(long customerId, String name,CompanyType companyType) {
		super(customerId, name);
		// TODO Auto-generated constructor stub
		this.companyType=companyType;
	}

	public Corporate(long customerId, String name) {
		super(customerId, name);
		// TODO Auto-generated constructor stub
	}

	public CompanyType getCompanyType() {
		return companyType;
	}

	public void setCompanyType(CompanyType companyType) {
		this.companyType = companyType;
	}
	
	
	
}
