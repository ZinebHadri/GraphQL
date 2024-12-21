package com.example.student;

import com.example.student.dto.EtudiantDTO;
import com.example.student.service.EtudiantService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.Date;

import java.util.List;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

    @Bean
    CommandLineRunner start(EtudiantService etudiantService){
        return  args -> {
            List<EtudiantDTO> etudiantsDTO = List.of(
                    EtudiantDTO.builder().name("zineb").email("zineb@gmail.com").dateNaissance(new Date()).build(),
                    EtudiantDTO.builder().name("adam").email("adam@gmail.com").dateNaissance(new Date()).build(),
                    EtudiantDTO.builder().name("mohamed").email("mohamed@gmail.com").dateNaissance(new Date()).build(),
                    EtudiantDTO.builder().name("salma").email("salma@gmail.com").dateNaissance(new Date()).build()
            );

            etudiantService.saveEtudiants(etudiantsDTO);
        };
    }
}
