package com.example.service;

import com.example.model.School;
import com.example.repository.SchoolPrimaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolPrimaryRepository schoolRepo;

    public List<School> getAllSchools() {
        return schoolRepo.findAll();
    }
}
