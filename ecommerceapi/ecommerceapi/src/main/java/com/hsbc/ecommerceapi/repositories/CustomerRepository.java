package com.hsbc.ecommerceapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.ecommerceapi.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

	
}
