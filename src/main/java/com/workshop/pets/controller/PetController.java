package com.workshop.pets.controller;

import com.workshop.pets.domain.Pet;
import com.workshop.pets.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    private PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Pet savePet(@RequestBody Pet pet) {
        return petService.savePet(pet);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Pet findPet(@PathVariable Long id) {
        return petService.findPetById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Pet> findAll() {
        return petService.findAll();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Long id) {
        petService.deletePet(id);
    }
}
