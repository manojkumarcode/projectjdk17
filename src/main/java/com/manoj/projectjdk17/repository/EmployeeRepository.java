package com.manoj.projectjdk17.repository;

import com.manoj.projectjdk17.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import java.util.List;
//@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByManagerId(Long managerId);

    @Query("select e from Employee e where e.manager.id = :managerId")
    List<Employee> findEmployeesReportingToManager(@Param("managerId" ) Long managerId);
}
