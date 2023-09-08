package com.hsbc.springcontext.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ResourceLoader;

import com.hsbc.banklib.models.Address;

@Configuration
public class Customer implements BeanNameAware, BeanClassLoaderAware,
BeanFactoryAware, ResourceLoaderAware {
	
	private long customerId;
	private String name;	
	private List<Account> accounts;
	
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(long customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
		
	}
	
	
	

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Bean("address")
	@Lazy
	public Address getAddress() {
		return new Address();
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub
		System.out.println("Resource Loader"+resourceLoader.getClass().getName());	
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean Factory"+beanFactory.containsBean("customer"));	
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		// TODO Auto-generated method stub
		System.out.println("Bean Class Loader"+classLoader.getName());
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bean Name"+name);
	}
	
	

}
