package com.pavel.university.dao;

import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Pavel on 28.04.2014.
 */
public interface GeneralDao <E, I extends Serializable>{

    public List<E> findByCriteria(Criterion criterion);

    public <T> List<T> loadAll();

    public void save(E e);

    public void update(E e);

    public void delete(E e);

    public E findById(I id);

}
