package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Management")
public class Management extends Person {

//    @OneToMany(mappedBy = "Management")
//    private List<EngineeringStreams> EngineeringStreams = new ArrayList<>();

//    public Management(int id, String firstName, String lastName, String email, String password){
//        this.id=id;
//
//    }
}
