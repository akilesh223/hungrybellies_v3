package com.cuboulder.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuboulder.models.Address;

public interface AddressRepository extends CrudRepository<Address, String>{

}
