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
@Table(name = "numbers")
public class Numbers extends Category {

    @Id
    @NotNull
    private long wordId;

    @NotNull
    private String word;

    @NotNull
    private String imageURL;

}