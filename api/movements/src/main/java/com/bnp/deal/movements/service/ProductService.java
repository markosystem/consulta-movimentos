package com.bnp.deal.movements.service;

import com.bnp.deal.movements.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> findAll();
}
