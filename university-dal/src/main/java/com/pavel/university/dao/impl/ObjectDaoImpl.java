package com.pavel.university.dao.impl;

import com.pavel.university.dao.ObjectDao;
import com.pavel.university.entity.Object;
/**
 * Created by Pavel on 29.04.2014.
 */
public class ObjectDaoImpl extends GeneralDaoImpl<Object, Integer> implements
        ObjectDao {

    public ObjectDaoImpl() {
        super(Object.class);
    }
}
