package com.example.studentHub.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
                    27
            );
            Student eva = new Student(
                    "Eva",
                    "Eichelmann",
                    "eva.eichelmann@web.de",
                    22
            );

            studentRepository.saveAll(
                    List.of(tushar,eva)
            );
        };
    }
}
