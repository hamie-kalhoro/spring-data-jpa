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
            StudentRepository repository) {
        return args -> {
            Student hamid = new Student(
                        "hamid",
                        "hamidkalhoro.in@gmail.com",
                        LocalDate.of(2005, Month.JANUARY, 13)
            );

            Student muhammad = new Student(
                    "muhammad",
                    "muhammad.net@yahoo.com",
                    LocalDate.of(2014, Month.MARCH, 17)
            );

            repository.saveAll(
                    List.of(hamid, muhammad)
            );
        };
    }
}
