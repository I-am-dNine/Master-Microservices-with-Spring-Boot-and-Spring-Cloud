package com.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learn_jpa_and_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	@Autowired
	private CourseJdbcRepository repository;

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
