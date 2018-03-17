package com.example.SpringPOC.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringPOC.entity.Customer;
import com.example.SpringPOC.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	public CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		List<Customer> customerList = new ArrayList<>();
		customerRepository.findAll().forEach(customerList::add);
		return customerList;
	}
	public void addCustomer(Customer customer){
		customerRepository.save(customer);
	}
}
