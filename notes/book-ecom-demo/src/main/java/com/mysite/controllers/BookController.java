package com.mysite.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysite.model.Book;
import com.mysite.repo.BookRepository;


@RestController
public class BookController {
	
	
	private final BookRepository bookRepository;
	
	BookController(BookRepository bookRepository){
		this.bookRepository = bookRepository;
	}
	
	@GetMapping("/books")
	List<Book> getAll(){
		return bookRepository.findAll();
	}
	
	@GetMapping("/books/{id}")
	Optional<Book> getBookById(@PathVariable Long id){
		return bookRepository.findById(id);
	}
	
	@PostMapping("/books")
	Book newBook(@RequestBody Book Book){
		return bookRepository.save(Book);
	}
	
	@DeleteMapping("/books/{id}")
	void deleteBookById(@PathVariable Long id){
		bookRepository.deleteById(id);
	}
	
	@PutMapping("/books/{id}")
	Book updateBook(@PathVariable Long id, @RequestBody Book newBook){
		return bookRepository.findById(id).map(
				Book -> {
					Book.setName(newBook.getName());
					return bookRepository.save(Book);
				}).orElseGet(() -> {
					newBook.setId(id);
					return bookRepository.save(newBook);
				});
	}
	
}

