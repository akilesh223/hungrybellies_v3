package com.cuboulder.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuboulder.models.RestaurantUser;



public interface RestaurantUserRepository extends CrudRepository<RestaurantUser, String>{

}
