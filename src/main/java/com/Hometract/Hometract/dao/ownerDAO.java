package com.Hometract.Hometract.dao;

import com.Hometract.Hometract.entities.owner;

import java.util.List;

public interface ownerDAO {
    public List<owner> getAllOwners();

    public void save(owner owner);

    public owner findById(int id);
}
