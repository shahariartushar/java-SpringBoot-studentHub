package com.example.studentHub.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student tushar = new Student(
                    "Naimul MD",
                    "Shahariar",
                    "shahariartushar@gmail.com",
                    LocalDate.of(1995, Month.OCTOBER,22)
            );
            Student eva = new Student(
                    "Eva",
                    "Eichelmann",
                    "eva.eichelmann@web.de",
                    LocalDate.of(2000, Month.AUGUST,10)
            );

            studentRepository.saveAll(
                    List.of(tushar,eva)
            );
        };
    }
}
