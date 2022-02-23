package com.example.demo.student;

import static java.time.Month.JUNE;
import static java.time.Month.MAY;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student antoine = new Student(
					"name",
					"email",
					LocalDate.of(1970, JUNE, 1)
			);
			Student eugenie = new Student(
					"name",
					"email",
					LocalDate.of(1980, JUNE, 1)
			);
			
			repository.saveAll(
					List.of(antoine, eugenie)
			);
		};
	}
}
