package com.pavel.university.dao.impl;

import com.pavel.university.dao.FacultyDao;
import com.pavel.university.entity.Faculty;

/**
 * Created by Pavel on 29.04.2014.
 */
public class FacultyDaoImpl extends GeneralDaoImpl<Faculty, Integer> implements FacultyDao {


    public FacultyDaoImpl() {
        super(Faculty.class);
    }
}
