package com.spring.repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.spring.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

	
}
