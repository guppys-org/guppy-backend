package org.github.guppy.backend.services;

import org.github.guppy.backend.models.Business;
import org.github.guppy.backend.repositories.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusinessService {

    BusinessRepository businessRepository;

    public BusinessService(@Autowired BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }


    public List<Business> getBusiness() {
        List<Business> businesses = new ArrayList<Business>();
        Iterable<Business> result = businessRepository.findAll();
        result.forEach(businesses::add);
        return businesses;

    }
}
