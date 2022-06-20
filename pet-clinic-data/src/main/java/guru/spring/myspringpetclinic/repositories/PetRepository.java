package guru.spring.myspringpetclinic.repositories;

import guru.spring.myspringpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
