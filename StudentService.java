package com.example.studentapp.service;

import com.example.studentapp.model.Student;
import com.example.studentapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repo;

    @Autowired
    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> findAll() { return repo.findAll(); }

    public Optional<Student> findById(Long id) { return repo.findById(id); }

    public Student save(Student s) { return repo.save(s); }

    public void deleteById(Long id) { repo.deleteById(id); }
}
