package com.reuben.sprinboot.learnspringboot.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseSpringDataJpa extends JpaRepository<Course, Integer> {
}
