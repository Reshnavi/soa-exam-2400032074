package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.Bakery;

public interface BakeryService {
    
    Bakery addBakery(Bakery bakery);
    
    List<Bakery> displayAllBakeries();
    
    String deleteBakery(Long id);
}