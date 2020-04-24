package com.bnp.deal.movements.controller;

import com.bnp.deal.movements.model.MovementManual;
import com.bnp.deal.movements.model.Product;
import com.bnp.deal.movements.service.MovementManualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("v1/movimentos")
public class MovementController {
    @Autowired
    private MovementManualService service;

    @GetMapping("")
    public List<MovementManual> allMovements() {
        return service.findAll();
    }

    @PostMapping
    @Transactional
    public ResponseEntity<MovementManual> newMovement(@RequestBody @Valid MovementManual form, UriComponentsBuilder uriBuilder) {
        Integer idMax = service.count();
        form.setNumLancamento(idMax == null ? 1 : idMax + 1);
        MovementManual movementManual = service.save(form);
        URI uri = uriBuilder.path("v1/movimentos/post").buildAndExpand("").toUri();
        return ResponseEntity.created(uri).body(movementManual);
    }
}
