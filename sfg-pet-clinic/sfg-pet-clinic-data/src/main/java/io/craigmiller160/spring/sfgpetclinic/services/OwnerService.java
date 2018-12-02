package io.craigmiller160.spring.sfgpetclinic.services;

import io.craigmiller160.spring.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
