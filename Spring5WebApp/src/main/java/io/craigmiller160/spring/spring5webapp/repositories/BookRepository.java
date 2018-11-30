package io.craigmiller160.spring.spring5webapp.repositories;

import io.craigmiller160.spring.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
