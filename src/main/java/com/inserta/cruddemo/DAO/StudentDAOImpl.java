package com.inserta.cruddemo.DAO;

import com.inserta.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private EntityManager entityManager;

    @Autowired //opcional si solo hay un constructor
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student newStudent) {
        this.entityManager.persist(newStudent);
    }

    @Override
    public Student findById(Integer id) {
        return this.entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student", Student.class);
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query = entityManager.createQuery(
                "FROM Student WHERE lastName=:newLastName", Student.class
        );
        query.setParameter("newLastName", lastName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Student updatedStudent) {
        entityManager.merge(updatedStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student student = this.entityManager.find(Student.class, id);
        entityManager.remove(student);
    }

}
