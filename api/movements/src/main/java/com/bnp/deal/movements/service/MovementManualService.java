package com.bnp.deal.movements.service;

import com.bnp.deal.movements.model.MovementManual;

import java.util.List;

public interface MovementManualService {
    MovementManual save(MovementManual movementManual);
    List<MovementManual> findAll();
    Integer count();
}
