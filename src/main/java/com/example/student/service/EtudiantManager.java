package com.example.student.service;

import com.example.student.dao.entities.Etudiant;
import com.example.student.dao.repositories.EtudiantRepository;
import com.example.student.dto.EtudiantDTO;
import com.example.student.mapper.EtudiantMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantManager implements EtudiantService {
    private EtudiantRepository etudiantRepository;
    private EtudiantMapper etudiantMapper;

    @Override
    public EtudiantDTO saveEtudiant(EtudiantDTO  etudiantDTO) {
        Etudiant etudiant= etudiantMapper.fromEtudiantDtoToEtudiant(etudiantDTO);
        etudiant= etudiantRepository.save(etudiant);
        etudiantDTO = etudiantMapper.fromEtudiantToEtudiantDTO(etudiant);
        return etudiantDTO;


    }
    @Override
    public boolean deleteEtudiant(Long id) {
        try {
            etudiantRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<EtudiantDTO> getEtudiantByDateNaissance(Date DateNaissance) {
        List<Etudiant> etudiants = etudiantRepository.findByDateNaissance( DateNaissance);
        List<EtudiantDTO> etudiantDTOS = new ArrayList<>();
        for ( Etudiant etudiant : etudiants) {
            etudiantDTOS.add(etudiantMapper.fromEtudiantToEtudiantDTO(etudiant));
        }
        return  etudiantDTOS;
    }

    @Override
    public List<EtudiantDTO> saveEtudiants(List<EtudiantDTO> etudentDtos) {
        List<Etudiant> etudiants = new ArrayList<>();
        for (EtudiantDTO etudiantDTO : etudentDtos) {
            etudiants.add(etudiantMapper.fromEtudiantDtoToEtudiant(etudiantDTO));
        }

        etudiants = etudiantRepository.saveAll(etudiants);

        etudentDtos = new ArrayList<>();
        for (Etudiant etudiant: etudiants) {
            etudentDtos.add(etudiantMapper.fromEtudiantToEtudiantDTO(etudiant));
        }
        return etudentDtos;
    }


}
