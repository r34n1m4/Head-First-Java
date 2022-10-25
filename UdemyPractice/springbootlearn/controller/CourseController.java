package com.reanima.springboot.springbootlearn.controller;

import com.reanima.springboot.springbootlearn.bean.Course;
import com.reanima.springboot.springbootlearn.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/* to implement:
GET
POST
PUT
DELETE
 */
@RestController
public class CourseController {
    @Autowired
    private CourseRepository repository;
    //GET
    // http:/localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return repository.findAll();
    //    return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"),
    //            new Course(2, "Learn Java", "in28minutes"));
    }
    // http:/localhost:8080/courses/1
    @GetMapping("/courses/{id}")
    public Course getOneCourse(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);
        if (course.isEmpty()) {
            throw new RuntimeException("Course not found with ID: " + id);
        }
        return course.get();
    }
    //POST
    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course) {
        repository.save(course);
    }
    //PUT
    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course) {
        repository.save(course);
    }
    //DELETE
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        repository.deleteById(id);
    }
}
