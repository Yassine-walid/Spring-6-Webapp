package com.springframework.spring_6_webapp.repositories;

import com.springframework.spring_6_webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
