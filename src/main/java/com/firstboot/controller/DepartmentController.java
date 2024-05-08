package com.firstboot.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstboot.pojo.Department;
import com.firstboot.service.DepartmentService;

@RestController
public class DepartmentController {
@Autowired
private DepartmentService departmentservice;
@PostMapping("/departments")
public Department saveDepartment(@RequestBody Department department)
{
return departmentservice.saveDepartment(department);
}
@GetMapping(value = "/dep")
public List<Department>fetchDepartmentList()
{
return departmentservice.fetchDepartmentList();
}
@GetMapping("/departments/{id}")
public Department fetchDepartmentById(@PathVariable("id") int departmentId)
{
return departmentservice.fetchDepartmentById(departmentId);
}
@DeleteMapping("/departments/{id}")
public String deleteDepartmentById(@PathVariable("id") int departmentId)
{
departmentservice.deleteDepartmentById(departmentId);
return "Record deleted successfully";
}
@PutMapping("/update")
public Department updateDepartmentById(@RequestBody Department department)
{
return departmentservice.updateDepartmentById(department);
}
}