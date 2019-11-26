package com.cuboulder.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuboulder.models.FoodOrder;



public interface OrderRepository extends CrudRepository<FoodOrder, String>{

}
