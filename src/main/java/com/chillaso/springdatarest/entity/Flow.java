package com.chillaso.springdatarest.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Flow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty("name")
    private String name;

    @OneToMany(mappedBy = "flow", cascade = CascadeType.ALL)
    @JsonProperty("nodes")
    private List<Node> nodes;
}
