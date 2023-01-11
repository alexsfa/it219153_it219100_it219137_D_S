package com.Hometract.Hometract.controllers;

import com.Hometract.Hometract.dao.ownerDAOImpl;
import com.Hometract.Hometract.entities.owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class ownerController {
    @Autowired
    private ownerDAOImpl ownerDAO;

    @GetMapping("")
    List<owner> getOwners() {
        return ownerDAO.getAllOwners();
    }

    @PostMapping("")
    owner save(@RequestBody owner owner) {
        owner.setId(0);
        ownerDAO.save(owner);
        return owner;
    }
}
