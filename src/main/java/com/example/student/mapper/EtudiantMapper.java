package com.example.student.mapper;


import com.example.student.dao.entities.Etudiant;
import com.example.student.dto.EtudiantDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component

public class EtudiantMapper {
    private final ModelMapper mapper = new ModelMapper();
    public  Etudiant fromEtudiantDtoToEtudiant(EtudiantDTO etudiantDTO){
        return mapper.map(etudiantDTO, Etudiant.class);
    }

    public EtudiantDTO fromEtudiantToEtudiantDTO(Etudiant etudiant){
        return mapper.map(etudiant, EtudiantDTO.class);
    }


}
