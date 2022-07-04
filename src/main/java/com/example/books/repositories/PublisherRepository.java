package com.example.books.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.books.entities.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
