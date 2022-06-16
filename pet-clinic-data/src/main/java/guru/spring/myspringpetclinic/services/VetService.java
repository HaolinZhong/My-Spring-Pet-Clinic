package guru.spring.myspringpetclinic.services;

import guru.spring.myspringpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
