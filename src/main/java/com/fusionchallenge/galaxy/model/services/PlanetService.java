package com.fusionchallenge.galaxy.model.services;

import com.fusionchallenge.galaxy.model.entities.Planet;
import com.fusionchallenge.galaxy.model.repositories.PlanetsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PlanetService {

    private PlanetsRepository planetsRepository;

    public Planet createPlanet(Planet planet) {
        return planetsRepository.save(planet);
    }

    public List<Planet> listAllPlanets() {
        return planetsRepository.findAll();
    }

    public Planet planetInfo(UUID id) {
        return planetsRepository.findById(id).orElse(null);
    }

    public Planet updatePlanet(UUID id, Planet planet) {
        return planetsRepository.findById(id).map(newPlanet -> {
            newPlanet.setName(planet.getName());
            newPlanet.setWeather(planet.getWeather());
            newPlanet.setTerrain(planet.getTerrain());
            newPlanet.setPopulation(planet.getPopulation());
            return planetsRepository.save(newPlanet);
        }).orElse(null);
    }

    public void deletePlanet(UUID id) {
        planetsRepository.deleteById(id);
    }
}
