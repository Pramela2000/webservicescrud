package com.firstboot.service;

import java.util.List;

import com.firstboot.pojo.Department;

public interface DepartmentService {
public Department saveDepartment(Department department);
public List<Department> fetchDepartmentList();
public Department fetchDepartmentById(int departmentId);
public void deleteDepartmentById(int departmentId);
public Department updateDepartmentById(Department department);
}
