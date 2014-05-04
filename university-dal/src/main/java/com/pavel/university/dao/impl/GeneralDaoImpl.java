package com.pavel.university.dao.impl;

import com.pavel.university.dao.GeneralDao;
import com.pavel.university.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

public abstract class GeneralDaoImpl<E, I extends Serializable> implements
        GeneralDao<E, I> {

    private Class<E> entityClass;

    protected GeneralDaoImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public void save(E e) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(e);
            transaction.commit();
        } catch (Exception e1) {
            if (transaction != null)
                transaction.rollback();
            e1.printStackTrace();
        } finally {
            session.close();
        }

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<E> findByCriteria(Criterion criterion) {

        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = null;
        Criteria criteria = null;
        try {
            transaction = session.beginTransaction();
            criteria = session.createCriteria(entityClass);
            criteria.add(criterion);
            transaction.commit();
        } catch (Exception e1) {
            if (transaction != null)
                transaction.rollback();
            e1.printStackTrace();
        } finally {
            session.close();
        }
        return criteria.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> List<T> loadAll() {

        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = null;
        List<T> results = null;
        try {
            transaction = session.beginTransaction();
            results = session.createCriteria(entityClass).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return (List<T>) results;
    }

    @Override
    public void update(E e) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            session.saveOrUpdate(e);
            transaction.commit();
        } catch (Exception e1) {
            if (transaction != null)
                transaction.rollback();
            e1.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(E e) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(e);
            transaction.commit();
        } catch (Exception e1) {
            if (transaction != null)
                transaction.rollback();
            e1.printStackTrace();
        } finally {
            session.close();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public E findById(I id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = null;
        E e = null;
        try {
            transaction = session.beginTransaction();
            e = (E) session.get(entityClass, id);
            transaction.commit();
        } catch (Exception e1) {
            if (transaction != null)
                transaction.rollback();
            e1.printStackTrace();
        } finally {
            session.close();
        }
        return e;

    }
}
