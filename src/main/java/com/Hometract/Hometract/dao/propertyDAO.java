package com.Hometract.Hometract.dao;

import com.Hometract.Hometract.entities.owner;
import com.Hometract.Hometract.entities.property;

import java.util.List;

public interface propertyDAO {
    public List<property> getAllProperties();

    public void save(property property);

    public property findByAddress(String address);
}
