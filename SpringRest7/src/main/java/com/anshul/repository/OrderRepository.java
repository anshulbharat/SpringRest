package com.anshul.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.anshul.model.Order;



public interface OrderRepository extends MongoRepository<Order,Integer> {

}
