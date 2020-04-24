package com.bnp.deal.movements.repository;

import com.bnp.deal.movements.model.ProductCosif;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCosifRepository extends CrudRepository<ProductCosif, String> {
}
