package io.craigmiller160.spring.sfgpetclinic.services;

import io.craigmiller160.spring.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();

}
