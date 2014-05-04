package com.pavel.university.dao.impl;

import com.pavel.university.dao.SpecialityDao;
import com.pavel.university.entity.Speciality;

/**
 * Created by Pavel on 29.04.2014.
 */
public class SpecialityDaoImpl extends GeneralDaoImpl<Speciality, Integer>
        implements SpecialityDao {

    public SpecialityDaoImpl() {
        super(Speciality.class);
    }
}
