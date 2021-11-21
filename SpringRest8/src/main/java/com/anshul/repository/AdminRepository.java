package com.anshul.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.anshul.model.Admin;


public interface AdminRepository extends MongoRepository<Admin,Integer> {

}
