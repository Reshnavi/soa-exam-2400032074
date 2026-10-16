package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.Bakery;
import com.klef.soa.exam.repository.BakeryRepository;

@Service
public class BakeryService {

    @Autowired
    private BakeryRepository bakeryRepository;

    public Bakery addBakery(Bakery bakery) {
        return bakeryRepository.save(bakery);  // ✅ instance call
    }

    public List<Bakery> displayAllBakeries() {
        return (List<Bakery>) bakeryRepository.findAll();
    }

    public String deleteBakery(Long id) {
        bakeryRepository.deleteById(id);
        return "Bakery deleted successfully with id: " + id;
    }
}
