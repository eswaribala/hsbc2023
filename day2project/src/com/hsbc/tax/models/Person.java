package com.hsbc.tax.models;

public class Person {
	
	private String panCardNo;
	private long income;
	private Gender gender;
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public long getIncome() {
		return income;
	}
	public void setIncome(long income) {
		this.income = income;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [panCardNo=" + panCardNo + ", income=" + income + ", gender=" + gender + "]";
	}
	

}
