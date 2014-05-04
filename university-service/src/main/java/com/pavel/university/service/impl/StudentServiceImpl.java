package com.pavel.university.service.impl;

/**
 * Created by Pavel on 30.04.2014.
 */

import com.pavel.university.dao.StudentDao;
import com.pavel.university.dao.impl.StudentDaoImpl;
import com.pavel.university.entity.Student;
import com.pavel.university.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl() {

        studentDao = new StudentDaoImpl();

    }

    @Override
    public void addStudent(Student student) {
        studentDao.save(student);

    }

    @Override
    public void editStudent(Student student) {
        studentDao.update(student);

    }

    @Override
    public List<Student> getAllStudent() {

        return studentDao.loadAll();
    }

    @Override
    public void removeStudent(Student student) {
        studentDao.delete(student);

    }

    @Override
    public Student getStudentById(Integer id) {

        return studentDao.findById(id);
    }

}

