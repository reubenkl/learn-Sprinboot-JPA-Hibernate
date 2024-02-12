package com.reuben.sprinboot.learnspringboot.course.jpa;

import com.reuben.sprinboot.learnspringboot.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @Autowired
    private EntityManager entityManager;
    public void insert(Course course){
        entityManager.merge(course);
    }

    public void deleteById(Integer id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

    public Course findById(Integer id){
        return entityManager.find(Course.class, id);
    }

}
