package com.pavel.university.dao.impl;

import com.pavel.university.dao.DepartmentDao;
import com.pavel.university.entity.Department;

/**
 * Created by Pavel on 28.04.2014.
 */
public class DepartmentDaoImpl extends GeneralDaoImpl<Department, Integer>
        implements DepartmentDao {

    public DepartmentDaoImpl() {
        super(Department.class);

    }


}
