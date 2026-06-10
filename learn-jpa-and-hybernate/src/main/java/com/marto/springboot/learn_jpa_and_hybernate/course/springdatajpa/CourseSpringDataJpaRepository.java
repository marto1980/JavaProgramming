package com.marto.springboot.learn_jpa_and_hybernate.course.springdatajpa;

import com.marto.springboot.learn_jpa_and_hybernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {}
