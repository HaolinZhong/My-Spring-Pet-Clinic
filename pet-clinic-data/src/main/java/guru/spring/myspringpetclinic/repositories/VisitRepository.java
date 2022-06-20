package guru.spring.myspringpetclinic.repositories;

import guru.spring.myspringpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
