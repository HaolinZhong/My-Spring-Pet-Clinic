package guru.spring.myspringpetclinic.repositories;

import guru.spring.myspringpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
