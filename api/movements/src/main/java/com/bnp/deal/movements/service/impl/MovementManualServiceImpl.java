package com.bnp.deal.movements.service.impl;

import com.bnp.deal.movements.model.MovementManual;
import com.bnp.deal.movements.repository.MovementManualRepository;
import com.bnp.deal.movements.service.MovementManualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovementManualServiceImpl implements MovementManualService {

    @Autowired
    private MovementManualRepository repository;

    @Override
    public MovementManual save(MovementManual movementManual) {
        return repository.save(movementManual);
    }

    @Override
    public List<MovementManual> findAll() {
        Iterable<MovementManual> it = repository.findAll();
        ArrayList<MovementManual> movementManuals = new ArrayList<>();
        it.forEach(movementManuals::add);
        return movementManuals;
    }

    @Override
    public Integer count() {
        return repository.findMaxIdMovement();
    }
}