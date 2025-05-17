package com.fusionchallenge.galaxy.model.services;

import com.fusionchallenge.galaxy.model.entities.StarSystem;
import com.fusionchallenge.galaxy.model.repositories.StarSystemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StarSystemService {

    private StarSystemRepository starSystemRepository;

    public StarSystem createStarSystem(StarSystem starSystem) {
        return starSystemRepository.save(starSystem);
    }

    public List<StarSystem> listAllStarSystems() {
        return starSystemRepository.findAll();
    }

    public StarSystem starSystemInfo(UUID id) {
        return starSystemRepository.findById(id).orElse(null);
    }

    public StarSystem updateStarSystem(UUID id, StarSystem starSystem) {
        return starSystemRepository.findById(id).map(newStarSystem -> {
            newStarSystem.setName(starSystem.getName());
            newStarSystem.setDescription(starSystem.getDescription());
            newStarSystem.setPlanets(starSystem.getPlanets());
            return starSystemRepository.save(newStarSystem);
        }).orElse(null);
    }

    public void deleteStarSystemById(UUID id) {
        starSystemRepository.deleteById(id);
    }
}
