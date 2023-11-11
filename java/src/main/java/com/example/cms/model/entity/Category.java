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
@Table(name = "EngineeringStreams")
public class EngineeringStreams {

    @Id
    @NotEmpty
    private String streamId;

    @NotEmpty
    private String streamName;

    @ManyToOne
    @JoinColumn(name = "ManagementId")
    //@MapsId("ManagementId")
//    @JsonIgnoreProperties({"marks"})
    private Management Management;



//    public EngineeringStreams(String code, String name, String managementId){
//        this.code = code;
//        this.name = name;
//        this.managementId = managementId;
//    }

}
