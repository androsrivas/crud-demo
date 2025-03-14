package com.inserta.cruddemo.DAO;

import com.inserta.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student newStudent);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    void update(Student newStudent);
    void delete(Integer id);
}
