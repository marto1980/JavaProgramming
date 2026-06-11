package com.marto.restapi.course.repository;

import com.marto.restapi.course.Course;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
  List<Course> findByAuthor(String author);

  List<Course> findByName(String name);
}
