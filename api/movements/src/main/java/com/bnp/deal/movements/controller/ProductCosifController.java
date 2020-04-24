package com.bnp.deal.movements.controller;

import com.bnp.deal.movements.model.ProductCosif;
import com.bnp.deal.movements.service.ProductCosifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/produtos_cosif")
public class ProductCosifController {

    @Autowired
    private ProductCosifService service;

    @GetMapping("")
    public List<ProductCosif> allProductsCosif() {
        return service.findAll();
    }
}
