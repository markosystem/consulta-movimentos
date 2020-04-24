package com.bnp.deal.movements.service.impl;

import com.bnp.deal.movements.model.ProductCosif;
import com.bnp.deal.movements.repository.ProductCosifRepository;
import com.bnp.deal.movements.service.ProductCosifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCosifServiceImpl implements ProductCosifService {

    @Autowired
    private ProductCosifRepository repository;

    @Override
    public ProductCosif save(ProductCosif productCosif) {
        return repository.save(productCosif);
    }

    @Override
    public List<ProductCosif> findAll() {
        Iterable<ProductCosif> it = repository.findAll();
        ArrayList<ProductCosif> products = new ArrayList<>();
        it.forEach(products::add);
        return products;
    }
}