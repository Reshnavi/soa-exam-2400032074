package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.Bakery;
import com.klef.soa.exam.service.BakeryService;

@RestController
@RequestMapping("/")
public class BakeryController {

    @Autowired
    private BakeryService bakeryService;

 
    @GetMapping("/")
    public String home() {
        return "CrudService running";
    }

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
