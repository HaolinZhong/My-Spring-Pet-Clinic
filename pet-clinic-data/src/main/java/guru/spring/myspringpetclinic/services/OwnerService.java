package guru.spring.myspringpetclinic.services;

import guru.spring.myspringpetclinic.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
    List<Owner> findAllByLastNameLike(String lastName);
}

