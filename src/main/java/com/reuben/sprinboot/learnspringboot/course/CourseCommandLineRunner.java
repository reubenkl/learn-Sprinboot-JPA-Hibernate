package com.reuben.sprinboot.learnspringboot.course;

import com.reuben.sprinboot.learnspringboot.course.jdbc.CourseJdbcRepository;
import com.reuben.sprinboot.learnspringboot.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository courseRepo;

//    @Autowired
//    private CourseJpaRepository courseRepo;

    @Autowired
    private CourseSpringDataJpa courseRepo;

    @Override
    public void run(String... args) throws Exception {
        courseRepo.save(new Course(1,"BookSpring1","Reuben"));
        courseRepo.save(new Course(2,"BookSpring2","Frank"));
        courseRepo.save(new Course(3,"BookSpring33","Smith"));

        courseRepo.deleteById(2);

        System.out.println(courseRepo.findById(1));
        System.out.println(courseRepo.findById(3));
    }
}
