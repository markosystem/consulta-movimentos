package com.bnp.deal.movements.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("")
public class IndexController {
    @GetMapping("")
    ResponseEntity<?> index() {
        return new ResponseEntity<>(Collections.singletonMap("message", "Welcome to the api 'Consulta de Movimentos Manuais'!"), HttpStatus.OK);
    }
}
