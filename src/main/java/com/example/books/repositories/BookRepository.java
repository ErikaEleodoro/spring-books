package com.example.books.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.books.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
