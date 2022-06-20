package guru.spring.myspringpetclinic.repositories;

import guru.spring.myspringpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
