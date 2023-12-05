package com.backend.SpringRestApi.repository;

import com.backend.SpringRestApi.entity.Course;
import com.backend.SpringRestApi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByNameContaining(String name);

}
