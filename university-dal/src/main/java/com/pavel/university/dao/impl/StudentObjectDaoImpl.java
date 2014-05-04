package com.pavel.university.dao.impl;

import com.pavel.university.dao.StudentObjectDao;
import com.pavel.university.entity.StudentObject;

/**
 * Created by Pavel on 29.04.2014.
 */
public class StudentObjectDaoImpl extends
        GeneralDaoImpl<StudentObject, Integer> implements StudentObjectDao {

    public StudentObjectDaoImpl() {
        super(StudentObject.class);
    }
}
