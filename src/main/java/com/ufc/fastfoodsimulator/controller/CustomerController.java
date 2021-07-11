package com.ufc.fastfoodsimulator.controller;

import com.ufc.fastfoodsimulator.entity.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CustomerController {
    @PostMapping(value ="/cliente")
    public ResponseEntity<String> create(@RequestBody @Valid Customer customer) {

        System.out.println("Nome " + customer.getName());
        return ResponseEntity.ok("Deu certo de novo!");
    }

}
