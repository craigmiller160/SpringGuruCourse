package io.craigmiller160.spring.spring5webapp.repositories;

import io.craigmiller160.spring.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
