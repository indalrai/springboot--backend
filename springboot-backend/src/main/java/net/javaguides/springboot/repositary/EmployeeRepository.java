package net.javaguides.springboot.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
