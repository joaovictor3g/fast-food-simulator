package com.ufc.fastfoodsimulator.entity;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    @NotBlank
    private String name;
    @CPF(message = "cpf inválido")
    private String cpf;
    @Column
    private String birthDate;
    @Email
    private String email;

    public Customer(@NotBlank String name, @CPF String cpf, String birthDate, @Email String email) {
        super();
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.email = email;
    }

    public Customer() {

    }

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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
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
