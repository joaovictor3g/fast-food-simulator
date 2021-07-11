package com.ufc.fastfoodsimulator.controller;

import com.ufc.fastfoodsimulator.DTO.CustomerRequest;
import com.ufc.fastfoodsimulator.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
public class CustomerController {
    @Autowired
    EntityManager entityManager;

    @PostMapping(value ="/cliente")
    @Transactional
    public ResponseEntity<String> create(@RequestBody @Valid CustomerRequest customerRequest) {
        Customer customer = customerRequest.toModel();
        entityManager.persist(customer);
        return ResponseEntity.ok("Deu certo!");
    }

}
