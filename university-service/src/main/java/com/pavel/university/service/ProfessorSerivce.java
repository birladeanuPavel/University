package com.pavel.university.service;

/**
 * Created by Pavel on 30.04.2014.
 */
import com.pavel.university.entity.Professor;

import java.util.List;

public interface ProfessorSerivce {

    public void addProfessor(Professor professor);

    public void editProfessor(Professor professor);

    public List<Professor> getAllProfessor();

    public void removeProfessor(Professor professor);

    public Professor getProfessorById(Integer id);
}
