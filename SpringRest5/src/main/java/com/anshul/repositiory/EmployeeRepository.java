package com.anshul.repositiory;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.anshul.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

	
}
