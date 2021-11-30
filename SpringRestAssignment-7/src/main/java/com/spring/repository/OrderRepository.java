package com.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.model.Order;



public interface OrderRepository extends MongoRepository<Order,Integer> {

}
