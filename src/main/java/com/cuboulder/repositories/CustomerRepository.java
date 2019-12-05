package com.cuboulder.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuboulder.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

	public Customer findByEmaiId(String emaiId);
	
}
