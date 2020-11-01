package net.vikram.springboot.curdrestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.vikram.springboot.curdrestfulwebservices.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
