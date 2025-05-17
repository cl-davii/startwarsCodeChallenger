package com.fusionchallenge.galaxy.model.repositories;

import com.fusionchallenge.galaxy.model.entities.Spaceship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpaceshipRepository extends JpaRepository<Spaceship, UUID> {}
