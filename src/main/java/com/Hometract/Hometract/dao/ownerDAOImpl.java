package com.Hometract.Hometract.dao;

import com.Hometract.Hometract.entities.owner;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import jakarta.transaction.Transactional;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ownerDAOImpl implements ownerDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<owner> getAllOwners() {
        Session session = entityManager.unwrap(Session.class);
        Query<owner> query = session.createQuery("from owner", owner.class);
        return query.getResultList();
    }

    @Override
    public void save(owner owner) {
        owner aOwner = entityManager.merge(owner);
    }

    @Override
    public owner findById(int id) {return entityManager.find(owner.class, id);}

}
