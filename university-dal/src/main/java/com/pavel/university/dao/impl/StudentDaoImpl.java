package com.pavel.university.dao.impl;

import com.pavel.university.dao.StudentDao;
import com.pavel.university.entity.Student;

/**
 * Created by Pavel on 29.04.2014.
 */
public class StudentDaoImpl extends GeneralDaoImpl<Student, Integer> implements
        StudentDao {

    public StudentDaoImpl() {
        super(Student.class);
    }





}
