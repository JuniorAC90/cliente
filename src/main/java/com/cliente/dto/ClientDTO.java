package com.cliente.dto;

import com.cliente.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @NotBlank(message = "O nome não pode ser vazio")
    private String name;
    private  String cpf;
    private Double income;
    @PastOrPresent(message = "Não pode ser data futura")
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client clientEntity) {
        id = clientEntity.getId();
        name = clientEntity.getName();
        cpf = clientEntity.getCpf();
        income = clientEntity.getIncome();
        birthDate = clientEntity.getBirthDate();
        children = clientEntity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
