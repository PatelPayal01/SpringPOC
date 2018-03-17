package com.example.SpringPOC.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringPOC.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
