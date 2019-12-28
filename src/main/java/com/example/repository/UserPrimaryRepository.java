package com.example.repository;

import com.example.model.secondary.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPrimaryRepository extends JpaRepository<User, Long> {
}
