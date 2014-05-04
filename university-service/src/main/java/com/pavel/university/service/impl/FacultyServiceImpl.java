package com.pavel.university.service.impl;

/**
 * Created by Pavel on 30.04.2014.
 */

import com.pavel.university.dao.FacultyDao;
import com.pavel.university.dao.impl.FacultyDaoImpl;
import com.pavel.university.entity.Faculty;
import com.pavel.university.service.FacultyService;

import java.util.List;

public class FacultyServiceImpl implements FacultyService {

    private FacultyDao facultyDao;

    public FacultyServiceImpl(){
        facultyDao = new FacultyDaoImpl();
    }

    @Override
    public void addFaculty(Faculty faculty) {
        facultyDao.save(faculty);

    }

    @Override
    public void editFaculty(Faculty faculty) {
        facultyDao.update(faculty);

    }

    @Override
    public List<Faculty> getAllFaculty() {

        return facultyDao.loadAll();
    }

    @Override
    public void removeFaculty(Faculty faculty) {
        facultyDao.delete(faculty);

    }

    @Override
    public Faculty getFacultyById(Integer id) {

        return facultyDao.findById(id);
    }

}

