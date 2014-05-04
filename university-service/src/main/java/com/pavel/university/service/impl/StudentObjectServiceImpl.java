package com.pavel.university.service.impl;

/**
 * Created by Pavel on 30.04.2014.
 */
import com.pavel.university.dao.StudentObjectDao;
import com.pavel.university.dao.impl.StudentObjectDaoImpl;
import com.pavel.university.entity.StudentObject;
import com.pavel.university.service.StudentObjectService;

import java.util.List;

public class StudentObjectServiceImpl implements StudentObjectService {

    private StudentObjectDao studentObjectDao;

    public StudentObjectServiceImpl() {

        studentObjectDao = new StudentObjectDaoImpl();
    }

    @Override
    public void addStudentObject(StudentObject studentObject) {
        studentObjectDao.save(studentObject);

    }

    @Override
    public void editStudentObject(StudentObject studentObject) {
        studentObjectDao.update(studentObject);

    }

    @Override
    public List<StudentObject> getAllStudentObject() {

        return studentObjectDao.loadAll();
    }

    @Override
    public void removeStudentObject(StudentObject studentObject) {
        studentObjectDao.delete(studentObject);

    }

    @Override
    public StudentObject getStudentObjectById(Integer id) {

        return studentObjectDao.findById(id);
    }

}

