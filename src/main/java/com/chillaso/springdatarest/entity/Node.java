package com.chillaso.springdatarest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Node {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "FLOW_ID")
    private Flow flow;
}
