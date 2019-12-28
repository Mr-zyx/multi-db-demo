package com.example.service;

import com.example.model.secondary.User;
import com.example.repository.UserPrimaryRepository;
import com.example.repository.secondary.UserSecondaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserPrimaryRepository userPrimaryRepo;

    @Autowired
    private UserSecondaryRepository userSecondaryRepo;

    public List<User> getPrimaryUsers() {
        return userPrimaryRepo.findAll();
    }

    public List<User> getSecondaryUsers() {
        return userSecondaryRepo.findAll();
    }
}
