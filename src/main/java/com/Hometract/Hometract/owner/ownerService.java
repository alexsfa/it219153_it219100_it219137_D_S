package com.Hometract.Hometract.owner;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ownerService {
    private List<owner> owners;
    public List<owner> getOwners() {
        return owners;
    }
}
