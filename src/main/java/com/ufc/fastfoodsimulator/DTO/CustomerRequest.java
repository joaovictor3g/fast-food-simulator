package com.ufc.fastfoodsimulator.DTO;

import com.ufc.fastfoodsimulator.entity.Customer;
import com.ufc.fastfoodsimulator.entity.Order;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

public class CustomerRequest {
    @Column
    @NotBlank
    private String name;
    @CPF(message = "cpf inválido")
    private String cpf;
    @Column
    private String birthDate;
    @Email
    private String email;
    private List<Order> orders;

    public CustomerRequest(@NotBlank String name, @CPF String cpf, String birthDate, @Email String email, List<Order> orders) {
        super();
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.email = email;
        this.orders = orders;
    }

    public CustomerRequest() {

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

    public Customer toModel() {
        return new Customer(this.name, this.cpf, this.birthDate, this.email, this.orders);
    }
}
