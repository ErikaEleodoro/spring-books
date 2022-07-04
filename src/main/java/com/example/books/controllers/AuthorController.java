package com.example.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.books.repositories.AuthorRepository;

@Controller
public class AuthorController {

	private final AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorrepository) {
		super();
		this.authorRepository = authorrepository;
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors", authorRepository.findAll());
		return "authors/list";
	}
	
}
