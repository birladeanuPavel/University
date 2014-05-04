package com.pavel.university.service;

/**
 * Created by Pavel on 30.04.2014.
 */
import com.pavel.university.entity.Faculty;

import java.util.List;

public interface FacultyService {

    public void addFaculty(Faculty faculty);

    public void editFaculty(Faculty faculty);

    public List<Faculty> getAllFaculty();

    public void removeFaculty(Faculty faculty);

    public Faculty getFacultyById(Integer id);
}
