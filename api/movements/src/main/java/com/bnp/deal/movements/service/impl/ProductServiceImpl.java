package com.bnp.deal.movements.service.impl;

import com.bnp.deal.movements.model.Product;
import com.bnp.deal.movements.repository.ProductRepository;
import com.bnp.deal.movements.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> findAll() {
        Iterable<Product> it = repository.findAll();
        ArrayList<Product> products = new ArrayList<>();
        it.forEach(products::add);
        return products;
    }
}