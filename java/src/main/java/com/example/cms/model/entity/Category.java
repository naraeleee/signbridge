package com.example.cms.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Category")
public abstract class Category {

    @Id
    @NotEmpty
    private long categoryId;

    @NotEmpty
    private String categoryName;

    @NotNull
    private int categoryProgress;

}
