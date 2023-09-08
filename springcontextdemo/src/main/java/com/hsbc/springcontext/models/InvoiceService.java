package com.hsbc.springcontext.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hsbc.springcontext.facades.InvoiceRepository;

@Component
public class InvoiceService {

	private InvoiceRepository invoiceRespository;
	@Autowired
	public InvoiceService(InvoiceRepository invoiceRepository) {
		super();
		// TODO Auto-generated constructor stub
		this.invoiceRespository=invoiceRepository;
	}

	
	
}
