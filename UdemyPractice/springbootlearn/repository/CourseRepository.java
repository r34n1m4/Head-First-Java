package com.reanima.springboot.springbootlearn.repository;

import com.reanima.springboot.springbootlearn.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
