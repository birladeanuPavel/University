package com.pavel.university.service.impl;

/**
 * Created by Pavel on 30.04.2014.
 */
import com.pavel.university.dao.DepartmentDao;
import com.pavel.university.dao.impl.DepartmentDaoImpl;
import com.pavel.university.entity.Department;
import com.pavel.university.service.DepartmentService;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentDao departmentDao;

    public DepartmentServiceImpl() {
        departmentDao = new DepartmentDaoImpl();
    }

    @Override
    public void addDepartment(Department department) {
        departmentDao.save(department);

    }

    @Override
    public void editDepartment(Department department) {
        departmentDao.update(department);

    }

    @Override
    public List<Department> getAllDepartment() {

        return departmentDao.loadAll();
    }

    @Override
    public void removeDepartment(Department department) {
        departmentDao.delete(department);

    }

    @Override
    public Department getDepartmentById(Integer id) {

        return departmentDao.findById(id);
    }

}
