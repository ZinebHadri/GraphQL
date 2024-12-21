package com.example.student.service;

import com.example.student.dto.EtudiantDTO;

import java.util.Date;
import java.util.List;

public interface EtudiantService {
   public EtudiantDTO saveEtudiant(EtudiantDTO etudiantDTO);
    public boolean deleteEtudiant (Long id);

    public List<EtudiantDTO> getEtudiantByDateNaissance(Date DateNaissance);

    public List<EtudiantDTO> saveEtudiants(List<EtudiantDTO> studentDtos);








}
