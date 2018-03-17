/*All the classes should be in same package or in subpackage as of SpringBoot class
 * If this controller is shifted to other package then annotate ApringPocApplication class with 
 * @ComponentScan(basePackageClasses = className.class)*/
package com.example.SpringPOC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringPOC.entity.Customer;
import com.example.SpringPOC.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customer")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(value ="/customer",method =RequestMethod.POST)
	public  void addCustomer(@RequestBody Customer customer){
		customerService.addCustomer(customer);
	}
}