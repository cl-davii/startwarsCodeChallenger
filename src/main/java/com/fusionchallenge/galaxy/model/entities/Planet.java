package com.fusionchallenge.galaxy.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique = true)
    private UUID id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String weather;
    @Column(nullable = false)
    private Double terrain;
    @Column(nullable = false)
    private Long population;
}
