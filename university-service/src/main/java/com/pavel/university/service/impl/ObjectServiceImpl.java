package com.pavel.university.service.impl;

/**
 * Created by Pavel on 30.04.2014.
*/

import com.pavel.university.dao.ObjectDao;
import com.pavel.university.dao.impl.ObjectDaoImpl;
import com.pavel.university.entity.Object;
import com.pavel.university.service.ObjectService;

import java.util.List;

public class ObjectServiceImpl implements ObjectService {

    private ObjectDao objectDao;

    public ObjectServiceImpl() {

        objectDao = new ObjectDaoImpl();
    }

    @Override
    public void addObject(Object object) {
        objectDao.save(object);
    }

    @Override
    public void editObject(Object object) {
        objectDao.update(object);

    }

    @Override
    public List<Object> getAllObject() {

        return objectDao.loadAll();
    }

    @Override
    public void removeObject(Object object) {
        objectDao.delete(object);

    }

    @Override
    public Object getObjectById(Integer id) {

        return objectDao.findById(id);
    }

}

