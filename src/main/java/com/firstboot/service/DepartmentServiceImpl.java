package com.firstboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstboot.pojo.Department;
import com.firstboot.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
@Autowired
private DepartmentRepository departmentRepository;
@Override
public Department saveDepartment(Department department)
{
return departmentRepository.save(department);
}
@Override
public List<Department> fetchDepartmentList()
{
return departmentRepository.findAll();
}
@Override
public Department fetchDepartmentById(int departmentId)
{
return departmentRepository.findById(departmentId).get();
}
@Override
public void deleteDepartmentById(int departmentId)
{
departmentRepository.deleteById(departmentId); 
}
@Override
public Department updateDepartmentById(Department department)
{
Department db=departmentRepository.findById(department.getDepartmentId()).orElse(null);
db.setDepartmentAddress(department.getDepartmentAddress()); 
db.setDepartmentCode(department.getDepartmentCode());
db.setDepartmentName(department.getDepartmentName());
return departmentRepository.save(db);
}

}

