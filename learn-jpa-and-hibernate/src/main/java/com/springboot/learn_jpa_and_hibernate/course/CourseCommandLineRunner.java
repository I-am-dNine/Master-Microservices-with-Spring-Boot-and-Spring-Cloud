package com.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learn_jpa_and_hibernate.course.Course;
import com.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJdbcRepository repository;
	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn Spring", "D1"));
		repository.insert(new Course(2, "Learn SpringMvc", "D2"));
		repository.insert(new Course(3, "Learn SpringBoot", "D3"));
		//
		repository.deleteById(2);
		//
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(3));

	}
		
}
