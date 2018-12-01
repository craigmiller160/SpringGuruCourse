package io.craigmiller160.spring.sfgpetclinic.services;

import io.craigmiller160.spring.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();

}
