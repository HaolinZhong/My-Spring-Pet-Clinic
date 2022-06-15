package guru.spring.myspringpetclinic.services;

import guru.spring.myspringpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
