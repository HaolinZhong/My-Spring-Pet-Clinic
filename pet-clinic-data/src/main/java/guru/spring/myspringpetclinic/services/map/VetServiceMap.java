package guru.spring.myspringpetclinic.services.map;

import guru.spring.myspringpetclinic.model.Pet;
import guru.spring.myspringpetclinic.model.Vet;
import guru.spring.myspringpetclinic.services.CrudService;
import guru.spring.myspringpetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object, object.getId());
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
