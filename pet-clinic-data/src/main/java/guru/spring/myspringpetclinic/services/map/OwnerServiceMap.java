package guru.spring.myspringpetclinic.services.map;

import guru.spring.myspringpetclinic.model.Owner;
import guru.spring.myspringpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long aLong) {
        return null;
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object, object.getId());
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
