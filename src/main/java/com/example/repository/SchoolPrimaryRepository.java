package com.example.repository;

import com.example.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolPrimaryRepository extends JpaRepository<School, Long> {
}
