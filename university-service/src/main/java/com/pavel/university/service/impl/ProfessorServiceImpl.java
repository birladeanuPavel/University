package com.pavel.university.service.impl;

/**
 * Created by Pavel on 30.04.2014.
 */
import com.pavel.university.dao.ProfessorDao;
import com.pavel.university.dao.impl.ProfessorDaoImpl;
import com.pavel.university.entity.Professor;
import com.pavel.university.service.ProfessorSerivce;

import java.util.List;

public class ProfessorServiceImpl implements ProfessorSerivce {

    private ProfessorDao professorDao;

    public ProfessorServiceImpl() {

        professorDao = new ProfessorDaoImpl();
    }

    @Override
    public void addProfessor(Professor professor) {
        professorDao.save(professor);

    }

    @Override
    public void editProfessor(Professor professor) {
        professorDao.update(professor);

    }

    @Override
    public List<Professor> getAllProfessor() {

        return professorDao.loadAll();
    }

    @Override
    public void removeProfessor(Professor professor) {
        professorDao.delete(professor);

    }

    @Override
    public Professor getProfessorById(Integer id) {

        return professorDao.findById(id);
    }

}

