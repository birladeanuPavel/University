package com.pavel.university.service;

/**
 * Created by Pavel on 30.04.2014.
 */
import com.pavel.university.entity.StudentObject;

import java.util.List;

public interface StudentObjectService {

    public void addStudentObject(StudentObject studentObject);

    public void editStudentObject(StudentObject studentObject);

    public List<StudentObject> getAllStudentObject();

    public void removeStudentObject(StudentObject studentObject);

    public StudentObject getStudentObjectById(Integer id);
}
