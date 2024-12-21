package com.example.student.dao.repositories;

import com.example.student.dao.entities.Etudiant;
import com.example.student.dto.EtudiantDTO;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Date;
import java.util.List;


public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

public List<Etudiant> findByDateNaissance(Date dateNaissance);


}
