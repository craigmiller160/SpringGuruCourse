package io.craigmiller160.spring.spring5webapp.bootstrap;

import io.craigmiller160.spring.spring5webapp.model.Author;
import io.craigmiller160.spring.spring5webapp.model.Book;
import io.craigmiller160.spring.spring5webapp.model.Publisher;
import io.craigmiller160.spring.spring5webapp.repositories.AuthorRepository;
import io.craigmiller160.spring.spring5webapp.repositories.BookRepository;
import io.craigmiller160.spring.spring5webapp.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Autowired
    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        Publisher harperCollins = new Publisher("Harper Collins", "123 Main St", "Somewhere", "NJ", "12345");
        publisherRepository.save(harperCollins);

        Publisher worx = new Publisher("Worx", "567 Hello Ct", "Anywhere", "FL", "67890");
        publisherRepository.save(worx);

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", harperCollins);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development Without EJB", "2344", worx);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }

}
