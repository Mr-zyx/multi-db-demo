package com.example.service;

import com.example.model.primary.Book;
import com.example.repository.primary.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
}
