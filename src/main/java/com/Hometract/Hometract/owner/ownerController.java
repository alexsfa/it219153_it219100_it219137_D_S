package com.Hometract.Hometract.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/owners")
public class ownerController {

    private final ownerService ownerService;
    private final ownerRepository ownerRepository;

    @Autowired
    public ownerController(com.Hometract.Hometract.owner.ownerService ownerService, com.Hometract.Hometract.owner.ownerRepository ownerRepository) {
        this.ownerService = ownerService;
        this.ownerRepository = ownerRepository;
    }
    @GetMapping
    public void getOwners() {
        ownerService.getOwners();
    }

    @RequestMapping(value = "/owners/allOwners")
    public ResponseEntity getAllOwners() {
        return ResponseEntity.ok(this.ownerRepository.findAll());
    }
}
