package com.pavel.university.dao.impl;

import com.pavel.university.dao.ObjectProfessorDao;
import com.pavel.university.entity.ObjectProfessor;

/**
 * Created by Pavel on 29.04.2014.
 */
public class ObjectProfessorDaoImpl extends
        GeneralDaoImpl<ObjectProfessor, Integer> implements ObjectProfessorDao {

    public ObjectProfessorDaoImpl() {
        super(ObjectProfessor.class);
    }
}
