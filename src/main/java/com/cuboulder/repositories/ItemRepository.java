package com.cuboulder.repositories;

import org.springframework.data.repository.CrudRepository;


import com.cuboulder.models.Item;

public interface ItemRepository extends CrudRepository<Item, String>{

}
