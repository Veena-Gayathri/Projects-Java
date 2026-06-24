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
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student mary = new Student(
                    "Mary",
                    LocalDate.of(2001, Month.JULY, 17),
                    "mary.cooper@gmail.com"
            );

            Student george = new Student(
                    "George",
                    LocalDate.of(2000, Month.JULY, 10),
                    "george.cooper@gmail.com"
            );

            repository.saveAll(
                    List.of(mary, george)
            );
        };
    }
}
