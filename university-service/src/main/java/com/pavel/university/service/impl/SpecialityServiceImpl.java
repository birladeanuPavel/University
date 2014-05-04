package com.pavel.university.service.impl;

/**
 * Created by Pavel on 30.04.2014.
 */
import com.pavel.university.dao.SpecialityDao;
import com.pavel.university.dao.impl.SpecialityDaoImpl;
import com.pavel.university.entity.Speciality;
import com.pavel.university.service.SpecialityService;

import java.util.List;

public class SpecialityServiceImpl implements SpecialityService {

    private SpecialityDao specialityDao;

    public SpecialityServiceImpl() {

        specialityDao = new SpecialityDaoImpl();

    }

    @Override
    public void addSpeciality(Speciality speciality) {
        specialityDao.save(speciality);

    }

    @Override
    public void editSpeciality(Speciality speciality) {
        specialityDao.update(speciality);

    }

    @Override
    public List<Speciality> getAllSpeciality() {

        return specialityDao.loadAll();
    }

    @Override
    public void removeSpeciality(Speciality speciality) {
        specialityDao.delete(speciality);

    }

    @Override
    public Speciality getSpecialityById(Integer id) {

        return specialityDao.findById(id);
    }

}

