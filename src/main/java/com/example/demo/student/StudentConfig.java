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
            Student nureles = new Student(
                    "Nureles",
                    "nureles@gmail.com",
                    LocalDate.of(2001, Month.AUGUST,30)
            );
            Student kurmanbek = new Student(
                    "Kurmanbek",
                    "kurmanbek@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,29)
            );
            Student iskhak = new Student(
                    "Iskhak",
                    "iskhak@gmail.com",
                    LocalDate.of(2011, Month.FEBRUARY,8)
            );
            Student alima = new Student(
                    "Alima",
                    "alima@gmail.com",
                    LocalDate.of(2017, Month.OCTOBER,30)
            );
            repository.saveAll(
                    List.of(nureles,kurmanbek,iskhak,alima)
            );
        };
    }
}
