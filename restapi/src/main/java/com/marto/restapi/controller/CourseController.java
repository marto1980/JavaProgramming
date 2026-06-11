package com.marto.restapi.controller;

import com.marto.restapi.course.Course;
import com.marto.restapi.course.repository.CourseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
  @Autowired private CourseRepository repository;

  // http://localhost:8080/courses
  @GetMapping("/courses")
  public List<Course> getAllCourses() {
    return repository.findAll();
    // return Arrays.asList(
    // new Course(1, "Learn Microservices", "in28minutes"),
    // new Course(2, "Learn Full Stack with Angular and React", "in28minutes"));
  }

  @GetMapping("/courses/1")
  public Course getCourseDetails() {
    return new Course(1, "Learn Microservices 1", "in28minutes");
  }
}
