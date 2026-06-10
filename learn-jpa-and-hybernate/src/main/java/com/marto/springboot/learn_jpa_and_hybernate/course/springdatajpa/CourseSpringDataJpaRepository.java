package com.marto.springboot.learn_jpa_and_hybernate.course.springdatajpa;

import com.marto.springboot.learn_jpa_and_hybernate.course.Course;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
  List<Course> findByAuthor(String author);

  List<Course> findByName(String name);
}
