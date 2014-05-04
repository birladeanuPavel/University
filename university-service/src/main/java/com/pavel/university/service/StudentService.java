package com.pavel.university.service;

import com.pavel.university.entity.Student;

import java.util.List;

/**
 * Created by Pavel on 02.05.2014.
 */
public interface StudentService{

        public void addStudent(Student student);

        public void editStudent(Student student);

        public List<Student> getAllStudent();

        public void removeStudent(Student student);

        public Student getStudentById(Integer id);
}


