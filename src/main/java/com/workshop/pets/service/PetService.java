package com.workshop.pets.service;

import com.workshop.pets.domain.Pet;
import com.workshop.pets.exception.PetNotFoundException;
import com.workshop.pets.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {

    private PetRepository petRepository;

    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }

    public Pet findPetById(Long id) {
        return petRepository.findById(id).orElseThrow(() -> new PetNotFoundException("Pet with id" + id + "does not exist"));
    }

    public List<Pet> findAll() {
        List<Pet> petList = new ArrayList<>();
        petRepository.findAll().iterator().forEachRemaining(petList::add);

        return petList;
    }

    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }
}
