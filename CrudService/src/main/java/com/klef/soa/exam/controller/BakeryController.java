package com.klef.soa.exam.controller;

import com.klef.soa.exam.entity.Bakery;
import com.klef.soa.exam.service.BakeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bakery")
public class BakeryController {

    @Autowired
    private BakeryService bakeryService;

    @PostMapping("/add")
    public Bakery addBakery(@RequestBody Bakery bakery) {
    	
        return bakeryService.addBakery(bakery);
    }

    @GetMapping("/all")
    public List<Bakery> displayAllBakeries() {
        return bakeryService.displayAllBakeries();
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteBakery(@PathVariable Long id) {
        return bakeryService.deleteBakery(id);
    }
}
