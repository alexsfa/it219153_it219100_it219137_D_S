package com.Hometract.Hometract.dao;

import com.Hometract.Hometract.entities.owner;
import com.Hometract.Hometract.entities.property;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class propertyDAOImpl implements propertyDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<property> getAllProperties() {
        Session session = entityManager.unwrap(Session.class);
        Query<property> query = session.createQuery("from property", property.class);
        return query.getResultList();
    }

    @Override
    public void save(property property) {
        property aProperty = entityManager.merge(property);
    }

    @Override
    public property findByAddress(String address) {return entityManager.find(property.class, address);}
}
