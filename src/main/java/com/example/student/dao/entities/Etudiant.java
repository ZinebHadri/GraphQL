package com.example.student.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Etudiant {
    @Id
    @GeneratedValue
    Long id_Student;
    String name;
    String email;
    Date dateNaissance;
}
