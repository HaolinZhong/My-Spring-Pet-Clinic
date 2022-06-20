package guru.spring.myspringpetclinic.repositories;

import guru.spring.myspringpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
