package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.Bakery;
import com.klef.soa.exam.repository.BakeryRepository;

@Service
public class BakeryServiceImpl implements BakeryService {

    @Autowired
    private BakeryRepository bakeryRepository;

    @Override
    public Bakery addBakery(Bakery bakery) {
        return bakeryRepository.save(bakery);  
    }

    @Override
    public List<Bakery> displayAllBakeries() {
        return (List<Bakery>) bakeryRepository.findAll();
    }

    @Override
    public String deleteBakery(Long id) {
        bakeryRepository.deleteById(id);
        return "Bakery deleted successfully with id: " + id;
    }
}