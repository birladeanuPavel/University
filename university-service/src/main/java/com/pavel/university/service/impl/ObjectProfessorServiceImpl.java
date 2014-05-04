package com.pavel.university.service.impl;

/**
 * Created by Pavel on 30.04.2014.
 */

import com.pavel.university.dao.ObjectProfessorDao;
import com.pavel.university.dao.impl.ObjectProfessorDaoImpl;
import com.pavel.university.entity.ObjectProfessor;
import com.pavel.university.service.ObjectProfessorService;

import java.util.List;

public class ObjectProfessorServiceImpl implements ObjectProfessorService {

    private ObjectProfessorDao objectProfessorDao;

    public ObjectProfessorServiceImpl() {

        objectProfessorDao = new ObjectProfessorDaoImpl();
    }

    @Override
    public void addObjectProfessor(ObjectProfessor objectProfessor) {
        objectProfessorDao.save(objectProfessor);

    }

    @Override
    public void editObjectProfessor(ObjectProfessor objectProfessor) {
        objectProfessorDao.update(objectProfessor);

    }

    @Override
    public List<ObjectProfessor> getAllObjectProfessor() {

        return objectProfessorDao.loadAll();
    }

    @Override
    public void removeObjectProfessor(ObjectProfessor objectProfessor) {
        objectProfessorDao.delete(objectProfessor);

    }

    @Override
    public ObjectProfessor getObjectProfessorById(Integer id) {

        return objectProfessorDao.findById(id);
    }

}
