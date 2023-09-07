package com.hsbc.springcoredemo.utilities;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hsbc.springcoredemo.models.Account;
import com.hsbc.springcoredemo.models.Corporate;
import com.hsbc.springcoredemo.models.Customer;
import com.hsbc.springcoredemo.models.Individual;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//IOC
	//Step1
		
		  Resource resource=new ClassPathResource("com/hsbc/" +
		  "springcoredemo/resources/applicationContext.xml");
		
		
	//Step 2		
		BeanFactory beanFactory=new XmlBeanFactory(resource);
	//Step 3
		Customer customer=(Customer) beanFactory.getBean("customer");	
		System.out.println("Customer Id "+customer.getCustomerId());
		System.out.println("Customer Name "+customer.getName());
		for(Account account: customer.getAccounts())
			System.out.println(account.getAccountNo()+","
						+account.getRunningTotal());
		
		
		
	//repeat
     Customer customer1=(Customer) beanFactory.getBean("newCustomer");			
		System.out.println("Customer Id "+customer1.getCustomerId());
		System.out.println("Customer Name "+customer1.getName());
		
		
	//scope of the object	
		Customer customer2=(Customer) beanFactory.getBean("customer");
		customer2.setCustomerId(453534);		
		System.out.println("Customer Id "+customer2.getCustomerId());
		System.out.println("Customer Name "+customer2.getName());

		
		//singleton
		System.out.println(customer.equals(customer2));
	
		//not singleton
		System.out.println(customer1.equals(customer2));
		
		//create individual instance
		
		Individual individual=(Individual) beanFactory.getBean("individual");
		System.out.println("Customer Id "+individual.getCustomerId());
		System.out.println("Customer Name "+individual.getName());
		
		System.out.println("DOB "+individual.getDob().toString());
		System.out.println("Gender "+individual.getGender());

        //create corporate instance
		Corporate corporate=(Corporate) beanFactory.getBean("corporate");
		System.out.println("Customer Id "+corporate.getCustomerId());
		System.out.println("Customer Name "+corporate.getName());		
		System.out.println("CompanyType "+corporate.getCompanyType());
	
		
		
		
		
	}

}
