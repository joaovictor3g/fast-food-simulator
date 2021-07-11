package com.ufc.fastfoodsimulator.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="order_id")
    private long id;
    @Column
    @NotBlank
    private String name;
    @PastOrPresent
    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Cook> cookList;

    @ManyToOne
    private Customer customer;

    public Order(String name, LocalDateTime createdAt, List<Cook> cookList, Customer customer) {
        this.name = name;
        this.createdAt = createdAt;
        this.cookList = cookList;
        this.customer = customer;
    }

    public Order() {}
}
