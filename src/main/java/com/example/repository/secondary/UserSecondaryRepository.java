package com.example.repository.secondary;

import com.example.model.secondary.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSecondaryRepository extends JpaRepository<User, Long> {
}
