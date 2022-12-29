package com.Hometract.Hometract.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/student")
public class ownerController {

    private final ownerService ownerService;

    @Autowired
    public ownerController(com.Hometract.Hometract.owner.ownerService ownerService) {
        this.ownerService = ownerService;
    }
    @GetMapping
    public void getOwners() {
        ownerService.getOwners();
    }
}
