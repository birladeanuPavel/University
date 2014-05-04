package com.pavel.university.dao.impl;

import com.pavel.university.dao.ProfessorDao;
import com.pavel.university.entity.Professor;

/**
 * Created by Pavel on 29.04.2014.
 */
public class ProfessorDaoImpl extends GeneralDaoImpl<Professor, Integer>
        implements ProfessorDao {

    public ProfessorDaoImpl() {
        super(Professor.class);
    }
}
