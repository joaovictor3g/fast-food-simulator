package com.ufc.fastfoodsimulator;

import com.ufc.fastfoodsimulator.controller.CustomerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FastFoodSimulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastFoodSimulatorApplication.class, args);
    }
}
