package com.cuboulder.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuboulder.models.Restaurant;


public interface RestaurantRepository extends CrudRepository<Restaurant, String>{

}
