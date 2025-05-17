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
public class Spaceship {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String model;
    @Column(nullable = false)
    private String manufacturer;
    @Column(nullable = false, unique = true)
    private int passengersCapacity;
}
