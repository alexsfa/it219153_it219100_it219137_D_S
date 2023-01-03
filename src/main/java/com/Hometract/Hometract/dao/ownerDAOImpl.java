package com.Hometract.Hometract.dao;

import com.Hometract.Hometract.entities.owner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import jakarta.websocket.Session;
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
        Query query = session.createQuery("from owners", com.Hometract.Hometract.entities.owner.class);
        List<owner> owners = query.getResultList();
        return owners;
    }
}
