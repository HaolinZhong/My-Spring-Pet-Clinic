package guru.spring.myspringpetclinic.services;

import guru.spring.myspringpetclinic.model.Specialty;

public interface SpecialtyService extends CrudService<Specialty, Long> {
    Specialty findById(Long id);
}
