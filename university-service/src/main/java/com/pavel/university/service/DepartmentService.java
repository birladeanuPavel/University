package com.pavel.university.service;

/**
 * Created by Pavel on 30.04.2014.
 */
import com.pavel.university.entity.Department;

import java.util.List;

public interface DepartmentService {

    public void addDepartment(Department department);

    public void editDepartment(Department department);

    public List<Department> getAllDepartment();

    public void removeDepartment(Department department);

    public Department getDepartmentById(Integer id);

}
