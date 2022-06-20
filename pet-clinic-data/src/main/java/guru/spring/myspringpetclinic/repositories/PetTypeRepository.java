package guru.spring.myspringpetclinic.repositories;

import guru.spring.myspringpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
