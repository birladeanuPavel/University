package com.pavel.university.service;

/**
 * Created by Pavel on 30.04.2014.
 */
import com.pavel.university.entity.Speciality;

import java.util.List;

public interface SpecialityService {

    public void addSpeciality(Speciality speciality);

    public void editSpeciality(Speciality speciality);

    public List<Speciality> getAllSpeciality();

    public void removeSpeciality(Speciality speciality);

    public Speciality getSpecialityById(Integer id);
}
