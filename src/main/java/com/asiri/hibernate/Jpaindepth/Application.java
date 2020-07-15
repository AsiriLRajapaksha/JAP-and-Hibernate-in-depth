package com.asiri.hibernate.Jpaindepth;

import com.asiri.hibernate.Jpaindepth.entity.Course;
import com.asiri.hibernate.Jpaindepth.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = repository.findById(10001L);

		logger.info("Course 10001L -> {}", course);
	}
}
