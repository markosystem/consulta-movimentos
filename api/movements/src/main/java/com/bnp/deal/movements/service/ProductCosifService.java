package com.bnp.deal.movements.service;

import com.bnp.deal.movements.model.ProductCosif;

import java.util.List;

public interface ProductCosifService {
    ProductCosif save(ProductCosif productCosif);
    List<ProductCosif> findAll();
}
