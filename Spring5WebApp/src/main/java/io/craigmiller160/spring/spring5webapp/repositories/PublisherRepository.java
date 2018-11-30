package io.craigmiller160.spring.spring5webapp.repositories;

import io.craigmiller160.spring.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
