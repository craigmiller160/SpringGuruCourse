package io.craigmiller160.spring.sfgpetclinic.services.map;

import io.craigmiller160.spring.sfgpetclinic.model.Owner;
import io.craigmiller160.spring.sfgpetclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        //TODO need to finish this...
        return null;
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}
