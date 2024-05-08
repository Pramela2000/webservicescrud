package com.firstboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstboot.pojo.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>

{

}
