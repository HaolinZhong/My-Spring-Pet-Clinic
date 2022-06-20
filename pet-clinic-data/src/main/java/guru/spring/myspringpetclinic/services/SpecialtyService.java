package guru.spring.myspringpetclinic.services;

import guru.spring.myspringpetclinic.model.Specialty;
import org.springframework.stereotype.Service;

@Service
public interface SpecialtyService extends CrudService<Specialty, Long> {

}
