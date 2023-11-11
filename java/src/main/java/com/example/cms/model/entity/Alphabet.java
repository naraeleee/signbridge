package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Indy")
public class Indy {
    @Id
    @NotEmpty
    private String Id;

    @NotNull
    private String Spec;
    @NotNull
    private String Indus;
    @NotNull
    private String Certifications;
    @NotNull
    private String Degree;
    @NotNull
    private String Sim_degree;
    @NotNull
    private String Job_name;
    @NotNull
    private String Job_salary;
    @NotNull
    private String Skills;

//    public Indy(String code, int capacity){
//        this.Id = code;
//        this.capacity = capacity;
//    }
}
