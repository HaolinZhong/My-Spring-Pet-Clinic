package guru.spring.myspringpetclinic.services;

import guru.spring.myspringpetclinic.model.Speciality;
import guru.spring.myspringpetclinic.services.map.AbstractMapService;
import org.springframework.stereotype.Service;

@Service
public interface SpecialityService extends CrudService<Speciality, Long> {

}
