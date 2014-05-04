package com.pavel.university.service;

import com.pavel.university.entity.ObjectProfessor;

import java.util.List;

/**
 * Created by Pavel on 30.04.2014.
 */
public interface ObjectProfessorService {

    public void addObjectProfessor(ObjectProfessor objectProfessor);

    public void editObjectProfessor(ObjectProfessor objectProfessor);

    public List<ObjectProfessor> getAllObjectProfessor();

    public void removeObjectProfessor(ObjectProfessor objectProfessor);

    public ObjectProfessor getObjectProfessorById(Integer id);
}
