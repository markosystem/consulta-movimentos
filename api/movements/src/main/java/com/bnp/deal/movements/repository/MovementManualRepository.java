package com.bnp.deal.movements.repository;

import com.bnp.deal.movements.model.MovementManual;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementManualRepository extends PagingAndSortingRepository<MovementManual, String> {

    @Query(value = "select max(NUM_LANCAMENTO) from MOVIMENTO_MANUAL", nativeQuery = true)
    Integer findMaxIdMovement();
}
