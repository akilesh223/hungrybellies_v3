package com.cuboulder.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuboulder.models.Rating;

public interface RatingRepository extends CrudRepository<Rating, String>{

}
