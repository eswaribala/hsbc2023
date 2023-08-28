package com.amazon.ecomm.models;

import java.time.LocalDate;
import java.util.Date;

public class Invoice {
	
	private long invoiceNo;
	private LocalDate date;
	private long amount;
	private Date expDate;
	
	
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(long invoiceNo, LocalDate date, long amount) {
		super();
		this.invoiceNo = invoiceNo;
		this.date = date;
		this.amount = amount;
	}
	public long getInvoiceNo() {
		return invoiceNo;
	}
	public LocalDate getDate() {
		return date;
	}
	public long getAmount() {
		return amount;
	}
	public void setInvoiceNo(long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	

}
