package com.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retreveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn JAVA", "Author 1"),
				new Course(2, "Learn C#", "Author 2")
				);
	}

}
