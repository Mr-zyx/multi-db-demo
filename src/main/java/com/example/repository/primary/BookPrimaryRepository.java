package com.example.repository.primary;

import com.example.model.primary.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPrimaryRepository extends JpaRepository<Book, Long> {
}
