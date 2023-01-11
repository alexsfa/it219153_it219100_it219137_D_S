package com.Hometract.Hometract.controllers;

import com.Hometract.Hometract.dao.propertyDAOImpl;
import com.Hometract.Hometract.entities.property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class propertyController {
    @Autowired
    private propertyDAOImpl propertyDAO;
    @GetMapping("")
    public List<property> getAllProperties() {
        return propertyDAO.getAllProperties();
    }

    
}
