package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student yangtae = new Student(
                    "yangtae",
                    "test@test.com",
                    LocalDate.of(1990, Month.NOVEMBER, 18)
            );
            Student chunmo = new Student(
                    "chunmo",
                    "test1@test.com",
                    LocalDate.of(1990, Month.NOVEMBER, 19)
            );

            repository.saveAll(
                    List.of(yangtae, chunmo)
            );
        };
    }
}
