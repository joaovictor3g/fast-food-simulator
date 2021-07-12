package com.ufc.fastfoodsimulator.controller;

import com.ufc.fastfoodsimulator.DTO.CustomerRequest;
import com.ufc.fastfoodsimulator.entity.Customer;
import com.ufc.fastfoodsimulator.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping(value = "/cliente")
    @Transactional
    public ResponseEntity<String> create(@RequestBody @Valid CustomerRequest customerRequest) {

        Customer customer = customerRequest.toModel();
        customerRepository.save(customer);
        return ResponseEntity.ok("Cliente criado com sucesso!");
    }

}
