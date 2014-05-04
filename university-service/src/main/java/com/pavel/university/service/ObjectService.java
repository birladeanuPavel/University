package com.pavel.university.service;

/**
 * Created by Pavel on 30.04.2014.
 */
import com.pavel.university.entity.Object;

import java.util.List;

public interface ObjectService {

    public void addObject(Object object);

    public void editObject(Object object);

    public List<Object> getAllObject();

    public void removeObject(Object object);

    public Object getObjectById(Integer id);
}

