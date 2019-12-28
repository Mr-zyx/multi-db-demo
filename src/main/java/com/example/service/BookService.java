package com.example.service;

import com.example.model.primary.Book;
import com.example.repository.primary.BookPrimaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookPrimaryRepository bookRepo;

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
}
