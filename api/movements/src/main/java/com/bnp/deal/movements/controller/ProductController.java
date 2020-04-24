package com.bnp.deal.movements.controller;

import com.bnp.deal.movements.model.Product;
import com.bnp.deal.movements.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("v1/produtos")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public List<Product> allProducts() {
        return productService.findAll();
    }
}
