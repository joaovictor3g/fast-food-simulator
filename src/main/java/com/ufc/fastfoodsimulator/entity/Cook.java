package com.ufc.fastfoodsimulator.entity;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="cook")
public class Cook {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="cook_id")
    private int id;
    @Column
    private String name;
    @CPF(message = "cpf inválido")
    private String cpf;
    @Column
    private LocalDate birthDate;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Order> orders;

    public Cook(String name, String cpf, LocalDate birthDate, List<Order> orders) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.orders = orders;
    }

    public Cook() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
