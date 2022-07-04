package com.example.books.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.books.entities.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
