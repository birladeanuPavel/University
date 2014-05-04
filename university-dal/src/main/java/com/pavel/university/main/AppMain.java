package com.pavel.university.main;

import com.pavel.university.dao.DepartmentDao;
import com.pavel.university.entity.Department;
import com.pavel.university.dao.impl.DepartmentDaoImpl;

/**
 * Created by Pavel on 28.04.2014.
 */
public class AppMain  {


    public static void main(String args []){


       DepartmentDao departmentDao = new DepartmentDaoImpl();
        Department department= departmentDao.findById(3);

        System.out.print(department.getName());

    }

}
